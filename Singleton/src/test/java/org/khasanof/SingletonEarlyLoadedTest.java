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


public class SingletonEarlyLoadedTest {

    @Test
    void testMultiCallInstance() {
        SingletonEarlyLoaded instance1 = SingletonEarlyLoaded.getInstance();
        SingletonEarlyLoaded instance2 = SingletonEarlyLoaded.getInstance();
        SingletonEarlyLoaded instance3 = SingletonEarlyLoaded.getInstance();

        Assertions.assertSame(instance1, instance2);
        Assertions.assertSame(instance1, instance3);
        Assertions.assertSame(instance2, instance3);
    }

    @Test
    void testMultiCallInstanceThreads() throws Exception {
        Assertions.assertTimeout(Duration.ofMillis(10000), () -> {
            final List<Callable<SingletonEarlyLoaded>> callables = IntStream.range(0, 10000)
                    .<Callable<SingletonEarlyLoaded>>mapToObj(i -> SingletonEarlyLoaded::getInstance)
                    .collect(Collectors.toList());

            ExecutorService executorService = Executors.newFixedThreadPool(8);
            List<Future<SingletonEarlyLoaded>> futures = executorService.invokeAll(callables);

            SingletonEarlyLoaded instance = SingletonEarlyLoaded.getInstance();
            for (Future<SingletonEarlyLoaded> future : futures) {
                SingletonEarlyLoaded singletonEarlyLoaded = future.get();
                Assertions.assertNotNull(singletonEarlyLoaded);
                Assertions.assertSame(singletonEarlyLoaded, instance);
            }

            executorService.shutdown();
        });
    }

}
