class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // [1,2,4,8]
        // [10,11,12,13]
        // [14,20,30,40]

        // [8, 13, 40]
        // l = 0, r = matrix.length - 1= 2, mid = 1;
        // target = 10 < 13;
        // r = mid = 1, mid = 0
        // target = 10 > 8
        // l = 1, r = 1, mid = 1;

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // binary search to find target row
        int left = 0;
        int right = matrix.length - 1;
        int targetRow = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int rowLastElement = matrix[mid][matrix[mid].length - 1];

            if (target == rowLastElement) {
                return true;
            } else if (target < rowLastElement) {
                targetRow = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (targetRow == -1) {
            return false;
        }

        // Binary search for target row
        left = 0;
        right = matrix[targetRow].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = matrix[targetRow][mid];

            if (target > result) {
                left = mid + 1;
            } else if (target < result) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;

    }
}
