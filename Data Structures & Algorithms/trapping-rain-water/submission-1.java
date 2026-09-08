class Solution {
    public int trap(int[] height) {
        // [0, 2, 0, 3, 1, 0, 1, 3, 2, 1]
        // 
        //
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        int l = 0, r = 0;
        for (int j = 0; j < height.length; j++) {
            if (height[j] > l) {
                l = height[j];
            }
            if (height[height.length - 1 - j] > r) {
                r = height[height.length - 1 - j];
            }
            prefix[j] = l;
            suffix[height.length - 1 - j] = r;
        }

        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int trappedWater = Math.min(prefix[i], suffix[i]) - height[i];
            sum += trappedWater > 0 ? trappedWater : 0;
        }
        return sum;
    }
}
