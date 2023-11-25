package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 11/25/2023 12:49 PM
 */
public abstract class ProcessorCounter {

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static void countDown() {
        count += 1;
    }

    public static void refresh() {
        count = 0;
    }

}
