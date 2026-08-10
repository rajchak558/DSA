package Bit_manipulation;

import java.text.DecimalFormat;

/*Problem Statement: Given an array nums of length n, every integer in the
array appears twice except for two integers. Identify and return the two
integers that appear only once in the array. Return the two numbers in
ascending order.

For example, if nums = [1, 2, 1, 3, 5, 2], the correct answer is
[3, 5], not [5, 3].

Example 1:
Input:
 nums = [1, 2, 1, 3, 5, 2]
Output:
 [3, 5]
Explanation:

The integers 3 and 5 have appeared only once.

Example 2:
Input:
 nums = [-1, 0]
Output:
 [-1, 0]
Explanation:

The integers -1 and 0 have appeared only once.*/
public class SingleNumberII {
    public static void main(String[] args) {
        int arr[]={1, 2, 1, 3, 5, 2};
        /**Traverse the entire array, performing an XOR operation on all numbers.
        This will effectively cancel out all the numbers that appear twice,
        leaving us with the XOR of the two unique numbers.

         Determine the rightmost set bit (bit that is 1) in the result from
         the first step. This set bit can be used to differentiate the two
         unique numbers since they must differ at this bit position.

        Traverse the array again, but this time divide the numbers into
        two groups:
        One group where the numbers have the rightmost set bit.
        Another group where the numbers do not have this bit set.

        Perform XOR operations while adding numbers in each group.
        This will cancel out the duplicate numbers, leaving only the
        unique numbers in each group.

        Sort the two unique numbers in ascending order and return them.*/
        int xorVal = 0;
        for (int i : arr) {
            xorVal ^= i;
        }

        // Get its last set bit
        xorVal &= -xorVal;

        int[] res = new int[2];

        for (int num : arr) {

            // If bit is not set, it belongs to the first set
            if ((num & xorVal) == 0) {
                res[0] ^= num;
            }

            // If bit is set, it belongs to the second set
            else {
                res[1] ^= num;
            }
        }

        // Ensure the order of the returned numbers is consistent
        if (res[0] > res[1]) {
            int temp = res[0];
            res[0] = res[1];
            res[1] = temp;
        }
        System.out.println(res[0]+" "+res[1]);




    }
}
