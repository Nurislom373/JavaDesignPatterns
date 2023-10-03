package org.khasanof

enum class SortAlgorithmsKt : SortingStrategy {

    QUICK_SORT {

        override fun sort(nums: IntArray?) {
            quickSort(nums!!, 0, nums.size - 1)
        }

        private fun quickSort(arr: IntArray, begin: Int, end: Int) {
            if (begin < end) {
                val partitionIndex = partition(arr, begin, end)
                quickSort(arr, begin, partitionIndex - 1)
                quickSort(arr, partitionIndex + 1, end)
            }
        }

        private fun partition(arr: IntArray, begin: Int, end: Int): Int {
            val pivot = arr[end]
            var i = begin - 1
            for (j in begin until end) {
                if (arr[j] <= pivot) {
                    i++
                    val swapTemp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = swapTemp
                }
            }
            val swapTemp = arr[i + 1]
            arr[i + 1] = arr[end]
            arr[end] = swapTemp
            return i + 1
        }

    }

}
