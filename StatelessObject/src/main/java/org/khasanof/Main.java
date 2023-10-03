package org.khasanof;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {5, 6, 21, 4, 3, 5, 86};

        System.out.println("nums = " + Arrays.toString(nums));
        SortingStrategy strategy = QuickSort.INSTANCE;
        strategy.sort(nums);
        System.out.println("nums = " + Arrays.toString(nums));

        SortingStrategy sortingStrategy = SortAlgorithms.MERGE_SORT;
        int[] nums2 = {5, 6, 21, 4, 3, 5, 86};
        System.out.println("nums2 = " + Arrays.toString(nums2));
        sortingStrategy.sort(nums2);
        System.out.println("nums2 = " + Arrays.toString(nums2));

    }
}
