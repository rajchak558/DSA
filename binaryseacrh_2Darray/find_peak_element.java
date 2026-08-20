package binaryseacrh_2Darray;
/*
*  Given a 0-indexed n x m matrix mat where no two adjacent cells are equal,
*  find any peak element mat[i][j] and return the array [i, j].
* A peak element in a 2D grid is an element that is strictly greater than
* all of its adjacent neighbours to the left, right, top, and bottom.
Assume that the entire matrix is surrounded by an outer perimeter with the
* value -1 in each cell.

Note: As there can be many peak values, 1 is given as output if the returned
* index is a peak number, otherwise 0
* Example 1:
Input:
 mat = [[5, 10, 8],
 *      [4, 25, 7],
 *      [3, 9, 6]]
Output:
 [1, 1]
Explanation:
 The value at index [1, 1] is 25, which is a peak because all its
 * neighbors (10, 7, 4, 9) are smaller.

Example 2:
Input:
 mat = [[1, 2, 3],
 *      [6, 5, 4],
 *      [7, 8, 9]]
Output:
 [2, 2]
Explanation:
 The value at index [2, 2] is 9, which is a peak as it is greater
 * than its neighbors (8, 4).*/
    public class find_peak_element {
    public static void main(String[] args){
        int arr[][] = {
                {1, 2, 5, 1, 4, 5},
                {2, 1, 1, 2, 3, 2},
                {1, 7, 6, 0, 10, 3},
                {3, 6, 2, 3, 7, 2}
        };
        int target = 15;
        int gg_boy[] = findPeakGrid(arr);
        System.out.println(arr[gg_boy[0]][gg_boy[1]]);
        for (int i:gg_boy)
            System.out.println(i+1);

    }

    public static  int maxElement(int[][] arr, int col) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int index = -1;

        // Iterate through each row to find the maximum element
        // in the specified column
        for (int i = 0; i < n; i++) {
            if (arr[i][col] > max) {
                max = arr[i][col];
                index = i;
            }
        }
        return index;
    }
    public static int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int low = 0;
        int high = m - 1;

        // Perform binary search on columns
        while (low <= high) {
            int mid = (low + high) / 2;

            // Find the index of the row with the maximum element
            // in the middle column
            int row = maxElement(arr, mid);

            // Determine left and right neighbors of middle element
            int left = mid - 1 >= 0 ? arr[row][mid - 1] : Integer.MIN_VALUE;
            int right = mid + 1 < m ? arr[row][mid + 1] : Integer.MIN_VALUE;

            // Check if the middle element is a peak
            if (arr[row][mid] > left && arr[row][mid] > right) {
                return new int[]{row, mid};
            } else if (left > arr[row][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            /*  {1, 2, 5, 1, 4, 5},
                {2, 1, 1, 2, 3, 2},
                {1, 1, 6, 0, 10, 3},
                {3, 6, 2, 3, 7, 2}*/
        }

        // Return [-1, -1] if no peak element is found
        return new int[]{-1, -1};
    }

}
