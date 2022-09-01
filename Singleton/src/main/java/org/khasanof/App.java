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

public class App {

    public static void main(String[] args) {

        // early initialized singleton
        SingletonEarlyLoaded instance1 = SingletonEarlyLoaded.getInstance();
        SingletonEarlyLoaded instance2 = SingletonEarlyLoaded.getInstance();

        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);

        // lazy initialized singleton
        SingletonThreadSafeLazyLoaded instanceLazy1 = SingletonThreadSafeLazyLoaded.getInstance();
        SingletonThreadSafeLazyLoaded instanceLazy2 = SingletonThreadSafeLazyLoaded.getInstance();

        System.out.println("instanceLazy1 = " + instanceLazy1);
        System.out.println("instanceLazy2 = " + instanceLazy2);

        // initialized double locking singleton
        SingletonThreadSafeDoubleLocking instanceDoubleLocking1 = SingletonThreadSafeDoubleLocking.getInstance();
        SingletonThreadSafeDoubleLocking instanceDoubleLocking2 = SingletonThreadSafeDoubleLocking.getInstance();

        System.out.println("instanceDoubleLocking1 = " + instanceDoubleLocking1);
        System.out.println("instanceDoubleLocking2 = " + instanceDoubleLocking2);

        // initialized singleton inner class
        SingletonInnerClassLoaded instanceInner1 = SingletonInnerClassLoaded.getInstance();
        SingletonInnerClassLoaded instanceInner2 = SingletonInnerClassLoaded.getInstance();

        System.out.println("instanceInner1 = " + instanceInner1);
        System.out.println("instanceInner2 = " + instanceInner2);
    }

}
