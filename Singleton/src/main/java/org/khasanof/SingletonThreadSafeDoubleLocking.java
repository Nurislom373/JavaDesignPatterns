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

public final class SingletonThreadSafeDoubleLocking {

    private static volatile SingletonThreadSafeDoubleLocking INSTANCE;

    private SingletonThreadSafeDoubleLocking() {
        // to prevent instantiating by Reflection call
        if (INSTANCE != null) {
            throw new IllegalArgumentException("Initialized.");
        }
    }

    public static SingletonThreadSafeDoubleLocking getInstance() {

        var instance = INSTANCE;

        if (instance == null) {

            synchronized (SingletonThreadSafeDoubleLocking.class) {

                instance = INSTANCE;

                if (instance == null) {
                    instance = INSTANCE = new SingletonThreadSafeDoubleLocking();
                }
            }
        }
        return instance;
    }

}
