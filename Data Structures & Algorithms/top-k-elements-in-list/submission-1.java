class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> mapEntry : countMap.entrySet()) {
            int freq = mapEntry.getValue();
            int num = mapEntry.getKey();

            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(num);
        }
        
        int index = 0;
        int[] result = new int[k];
        for (int i = nums.length; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && index < k; j++) {
                    result[index] = bucket[i].get(j);
                    index += 1;
                }
            }
        }

        return result;
    }
}
