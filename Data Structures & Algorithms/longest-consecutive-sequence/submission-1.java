class Solution {
    public int longestConsecutive(int[] nums) {
        // [2, 20, 4, 10, 3, 5, 5]

        // convert the array to set
        // loop in the array nums
            // check for num - 1 in the set.
                // did not find it
                    // loop in array nums
                        // search for num + 1
                        // increment current_length
                // compare it with the max
                // update
        // return the max

        Set<Integer> numSet = new HashSet<>();
        for (int nbr : nums)
            numSet.add(nbr);

        int maxSize = 0;
        for (int n : nums) {
            if (!numSet.contains(n - 1)) {
                int currentSize = 1;
                int i = n;
                while (numSet.contains(i + 1)) {
                    currentSize++;
                    i++;
                }
                if (currentSize > maxSize)
                    maxSize = currentSize;
            }
        }
        return maxSize;
    }
}
