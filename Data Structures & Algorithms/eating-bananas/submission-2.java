class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;
        int right = piles[0];
        for (int n : piles) {
            right = Math.max(n, right);
        }

        while (left < right) {
            int k = (right + left) / 2;
            int s = 0;
            for (int x : piles) {
                s += Math.ceil((double) x / k);
            }
            if (s <= h) {
                right = k;
            }
            else {
                left = k + 1;
            }
        }
        return left;
    }
}
