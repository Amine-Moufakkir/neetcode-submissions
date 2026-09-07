class Solution {
    public int maxArea(int[] heights) {
        // [1, 7, 2, 5, 4, 7, 3, 6]
        // calculate current currentAmount
        // move the lowest height
        // compare with maxAmount

        int maxAmount = 0;
        int i = 0;
        int j = heights.length - 1;

        while (i < j) {
            int currentAmount = (j - i) * Math.min(heights[i], heights[j]);
            if (currentAmount > maxAmount) {
                maxAmount = currentAmount;
            }
            if (heights[i] < heights[j]) i++;
            else j--;
        }
        return maxAmount;
    }
}
