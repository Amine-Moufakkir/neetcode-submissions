class Solution {
    public int[] productExceptSelf(int[] nums) {
        // prefix and suffix product arrays
        int[] prefix_prd = new int[nums.length];
        int[] suffix_prd = new int[nums.length];
        suffix_prd[nums.length - 1] = 1;
        prefix_prd[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix_prd[i] = prefix_prd[i - 1] * nums[i - 1];
            suffix_prd[nums.length - 1 - i] = suffix_prd[nums.length - i] * nums[nums.length - i]; 
        }

        // result
        int[] result = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            result[j] = prefix_prd[j] * suffix_prd[j];
        }
        return result;
    }
}  
