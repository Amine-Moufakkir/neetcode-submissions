class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> innerList = new ArrayList<>();

    private void dfs(int index, int[] nums) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(innerList));
            return;
        }

        innerList.add(nums[index]);
        dfs(index + 1, nums);

        innerList.remove(innerList.size() - 1);
        dfs(index + 1, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return result;
    }
}
