package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/3/2023 10:12 PM
 */
public enum SortAlgorithms implements SortingStrategy {

    MERGE_SORT {

        @Override
        public void sort(int[] nums) {
            mergeSort(nums, 0, nums.length - 1);
        }

        private void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        private void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            for (int i = 0; i < n1; i++) {
                leftArray[i] = arr[left + i];
            }

            for (int i = 0; i < n2; i++) {
                rightArray[i] = arr[mid + 1 + i];
            }

            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k++] = leftArray[i++];
                } else {
                    arr[k++] = rightArray[j++];
                }
            }

            while (i < n1) {
                arr[k++] = leftArray[i++];
            }
            while (j < n2) {
                arr[k++] = rightArray[j++];
            }
        }

    },

    INSERTION_SORT {

        @Override
        public void sort(int[] nums) {
            int n = nums.length;
            for (int i = 1; i < n; i++) {
                int key = nums[i];
                int j = i - 1;
                while (j >= 0 && nums[j] > key) {
                    nums[j + 1] = nums[j];
                    j--;
                }
                nums[j + 1] = key;
            }
        }

    },

    SELECTION_SORT {

        @Override
        public void sort(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] < nums[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }

    },

    BUBBLE_SORT {

        @Override
        public void sort(int[] nums) {
            int n = nums.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) break;
            }
        }

    },

    QUICK_SORT {

        @Override
        public void sort(int[] nums) {
            quickSort(nums, 0, nums.length - 1);
        }

        public void quickSort(int arr[], int begin, int end) {
            if (begin < end) {
                int partitionIndex = partition(arr, begin, end);

                quickSort(arr, begin, partitionIndex-1);
                quickSort(arr, partitionIndex+1, end);
            }
        }

        private int partition(int arr[], int begin, int end) {
            int pivot = arr[end];
            int i = (begin-1);

            for (int j = begin; j < end; j++) {
                if (arr[j] <= pivot) {
                    i++;

                    int swapTemp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swapTemp;
                }
            }

            int swapTemp = arr[i+1];
            arr[i+1] = arr[end];
            arr[end] = swapTemp;

            return i+1;
        }

    };

}
