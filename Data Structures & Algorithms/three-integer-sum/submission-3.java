class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // [-1,0,1,2,-1,-4]
        // sorts
        // [-4, -1, -1, 0, 1, 2]
        // -1 + 2 = 1; 1 < 4;
        // 0 + 2 = 2; 2 < 4;
        // 1 + 2 = 3, 3 < 4;

        // target = 1;
        // -1 + 2 = 1; 1 == 1; donc (-1, 2, -1)
        
        // target = 1;
        // 0 + 2 = 2; 2 > 1;
        // 0 + 1 = 1; 1 == 1 donc (0, 1, -1)
        List<List<Integer>> sumList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];
            
            while (j < k) {
                int sum = nums[j] + nums[k];
                
                if (sum == target) {
                    sumList.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                    
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return sumList;

    }
}
