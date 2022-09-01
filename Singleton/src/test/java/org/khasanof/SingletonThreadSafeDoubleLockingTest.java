/*
 * MIT License
 * Copyright(c)2022 Nurislom

 * Permission is hereby granted,free of charge,to any person obtaining a copy
 * of this software and associated documentation files(the"Software"),to deal
 * in the Software without restriction,including without limitation the rights
 * to use,copy,modify,merge,publish,distribute,sublicense,and/or sell
 * copies of the Software,and to permit persons to whom the Software is
 * furnished to do so,subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED"AS IS",WITHOUT WARRANTY OF ANY KIND,EXPRESS OR
 * IMPLIED,INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,DAMAGES OR OTHER
 * LIABILITY,WHETHER IN AN ACTION OF CONTRACT,TORT OR OTHERWISE,ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.khasanof;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingletonThreadSafeDoubleLockingTest {

    @Test
    void testMultiCallInstance() {
        SingletonThreadSafeDoubleLocking instance1 = SingletonThreadSafeDoubleLocking.getInstance();
        SingletonThreadSafeDoubleLocking instance2 = SingletonThreadSafeDoubleLocking.getInstance();
        SingletonThreadSafeDoubleLocking instance3 = SingletonThreadSafeDoubleLocking.getInstance();

        Assertions.assertSame(instance1, instance2);
        Assertions.assertSame(instance1, instance3);
        Assertions.assertSame(instance2, instance3);
    }

    @Test
    void testMultiCallInstanceThreads() throws Exception {
        Assertions.assertTimeout(Duration.ofMillis(10000), () -> {
            final List<Callable<SingletonThreadSafeDoubleLocking>> callables = IntStream.range(0, 10000)
                    .<Callable<SingletonThreadSafeDoubleLocking>>mapToObj(i -> SingletonThreadSafeDoubleLocking::getInstance)
                    .collect(Collectors.toList());

            ExecutorService executorService = Executors.newFixedThreadPool(8);
            List<Future<SingletonThreadSafeDoubleLocking>> futures = executorService.invokeAll(callables);

            SingletonThreadSafeDoubleLocking instance = SingletonThreadSafeDoubleLocking.getInstance();
            for (Future<SingletonThreadSafeDoubleLocking> future : futures) {
                SingletonThreadSafeDoubleLocking singletonThreadSafeDoubleLocking = future.get();
                Assertions.assertNotNull(singletonThreadSafeDoubleLocking);
                Assertions.assertSame(singletonThreadSafeDoubleLocking, instance);
            }

            executorService.shutdown();
        });
    }

}
