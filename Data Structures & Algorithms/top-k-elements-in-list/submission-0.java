class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int[] kFrequent = new int[k];
        for (int i = 0; i < k; i++) {
            kFrequent[i] += entryList.get(i).getKey();
        }
        return kFrequent;
    }
}
