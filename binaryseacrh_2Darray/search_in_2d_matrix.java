//package binaryseacrh_2Darray;
//
///*
//    * Problem Statement: You have been given a 2-D array 'mat' of size 'N x M'
//    * where 'N' and 'M' denote the number of rows and columns, respectively.
//    * The elements of each row are sorted in non-decreasing order. Moreover,
//    * the first element of a row is greater than the last element of the previous
//    * row (if it exists). You are given an integer ‘target’, and your task is to
//    * find if it exists in the given 'mat' or not.
//    *
//    * Input :mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8
//    Output :True.
//    Explanation :The target = 8 exists in the 'mat' at index (1, 3).
//
//    Input :mat = [ [1, 2, 4], [6, 7, 8], [9, 10, 34] ], target = 78
//    Output :false.
//    Explanation :The target = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'
//    */
//public class search_in_2d_matrix {
//    public static void main(String args[]){
//        int arr[][]={{1,3,5,6,9},{10,15,16,18,19},{23,25,27,28,29}};
//        int target=16;
//        search2d(arr,target);
//
//    }
//    public static boolean search2d(int [][]mat, int target){
//        int beg=0,end= mat[0].length-1;
//        int left=0, right=mat.length-1;
//
//        while(left<right){
//            int mid=(left+right)/2;
//            if(target<mat[mid][end] && target>mat[mid][beg]){
//                boolean p= search1d(mat[mid],target);
//                return p;
//            } else if (target==mat[mid][end] || target==mat[mid][beg] || mat[left][end]==target || target==mat[left][beg] || mat[right][end]==target || target==mat[right][beg]) {
//                return true;
//            }
//            else if(target<mat[mid][end] && target<mat[mid][beg]){
//                right=mid;
//            }
//            else if(target>mat[mid][end] && target>mat[mid][beg]){
//                left=mid;
//            }
//
//        }
//        return false;
//    }
//    public static boolean search1d(int []mat, int target){
//        //int beg=0,end= mat[0].length;
//        int left=0, right=mat.length-1;
//        int mid=0;
//        while(left<right){
//            mid=(left+right)/2;
//            if(target==mat[mid] ){
//                return true;
//            }
//            else if(target>mat[mid]){
//                left=mid;
//            }
//            else{
//                right=mid;
//            }
//        }
//        return false;
//    }
//
//}
package binaryseacrh_2Darray;

public class search_in_2d_matrix {
    public static void main(String args[]) {
        int arr[][] = {
                {1, 3, 5, 6, 9},
                {10, 15, 16, 18, 19},
                {23, 25, 27, 28, 29}
        };
        int target = 16;

        System.out.println(search2d(arr, target));
    }

    public static boolean search2d(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;

        int left = 0, right = n * m - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int row = mid / m;
            int col = mid % m;

            if (mat[row][col] == target) {
                return true;
            } else if (mat[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}