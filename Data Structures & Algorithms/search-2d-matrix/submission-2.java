class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int globalSize = m * n;

        // // O(n2) solution
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (target == matrix[i][j]) {
        //             return true;
        //         }
        //     }
        // }

        

        // if row1 > row2, var1 > var2
        // elif row1 == row2, 
        //// if col1 > col2, var1 > var2
        //// if col1 == col2, target found?
        // else var2 > var1

        int left = 0;
        int right = globalSize - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            int row = mid / n;
            int col = mid % n;

            System.out.println("mid = " + mid + " checking r/c " + row + "," + col);
            int val = matrix[row][col];
            if (val == target) {
                return true;
            } else if (val > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
