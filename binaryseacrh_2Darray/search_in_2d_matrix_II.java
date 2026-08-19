package binaryseacrh_2Darray;

/*
    * Problem Statement: You have been given a 2-D array 'mat' of size 'N x M'
    * where 'N' and 'M' denote the number of rows and columns, respectively.
    * The elements of each row are sorted in non-decreasing order. Moreover,
    * the first element of a row is greater than the last element of the previous
    * row (if it exists). You are given an integer ‘target’, and your task is to
    * find if it exists in the given 'mat' or not.
    *
    * Input :mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8
    Output :True.
    Explanation :The target = 8 exists in the 'mat' at index (1, 3).

    Input :mat = [ [1, 2, 4], [6, 7, 8], [9, 10, 34] ], target = 78
    Output :false.
    Explanation :The target = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'
    */
public class search_in_2d_matrix_II {
    public static void main(String args[]) {
        int arr[][] = {{1, 3, 5, 6, 9},
                       {2, 4, 6, 7, 9},
                       {3, 4, 6, 9, 12},
                       {6, 9, 12, 15, 19},
                       {7, 14, 16, 19, 92}};
        int target = 15;
        boolean gg_boy = searchElement_opotimal(target,arr);
        System.out.println(gg_boy);

    }

    public static boolean search2d(int[][] mat, int target) {
        /*First we traverse through the rows one ny one
         * When we find the row within which the target might reside
         * Then we get that row and pass that in another method
         * by binary searching that method we determine whether target element
         * is present or not*/
        for (int i = 0; i < mat.length; i++) {
            if (target > mat[i][0] && target < mat[i][mat[i].length - 1]) {
                System.out.println(i);
                boolean result = search1d(mat[i], i, target);
                return result;
            }
        }
        return false;
    }

    public static boolean search1d(int[] mat, int pos, int target) {
        //int beg=0,end= mat[0].length;
        int left = 0, right = mat.length - 1;
        int mid = 0;
        System.out.println(mid + " " + left + " " + right);
        while (left <= right) {
            mid = (left + right) / 2;
            if (target == mat[mid]) {
                System.out.println("Present at " + (pos + 1) + " " + (mid + 1));
                return true;
            } else if (target > mat[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            //System.out.println(mid+" "+left+" "+right);
            // 3,4,6,9,12
        }
        return false;
    }

    public static boolean searchElement_opotimal(int target, int matrix[][]) {
        int n = matrix.length;        // Number of rows
        int m = matrix[0].length;     // Number of columns

        int row = 0;           // Start at first row
        int col = m - 1;       // Start at last column (top-right)

        // Traverse while within matrix bounds
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Found at "+(row+1)+" "+(col+1));
                return true; // Found target
            } else if (matrix[row][col] < target) {
                row++; // Move down
            } else {
                col--; // Move left
            }
        }

        return false; // Target not found


    }
}