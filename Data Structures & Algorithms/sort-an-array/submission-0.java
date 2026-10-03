class Solution {

    public int partition(int[] arr, int low, int high) {

        // [10, 80, 30, 90, 40]

        // partition --> 2
        //

        int i = low - 1;
        int pivot = arr[high];

        for (int j = low; j < high; j++) {
            if (pivot > arr[j]) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); 
        
        return i + 1;
    }


    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void quickSort(int[] nums, int low, int high) {
        if (high > low) {
            int pivot = partition(nums, low, high);
            quickSort(nums, pivot + 1, high);
            quickSort(nums, low, pivot - 1);
        }
    }

    public int[] sortArray(int[] nums) {

        quickSort(nums, 0, nums.length - 1);
        return nums;

    }
}