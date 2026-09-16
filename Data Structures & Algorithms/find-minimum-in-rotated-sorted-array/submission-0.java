class Solution {
    public int findMin(int[] nums) {

        // [3,4,5,6,1,2]
        // l=3, r= 2, mid= 5; mid > r;
        // l = mid + 1 = 6, r = 2; mid = 1 < r;
        // l = 6, r = mid = 1; mid = 6 > r;
        // l = mid + 1 = r = 1, r = 1; mid = 1 = r;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return nums[right];
    }
}
