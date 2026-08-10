package Bit_manipulation;

import java.util.Scanner;

/**
Problem Statement: Given a non-empty array of integers arr, every element
appears twice except for one. Find that single one.
* Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is
the answer.


Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other
elements appear twice. So, 4 is the answer.*/
public class SingleNumberI {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        /**
         * Intuition
         * Two important properties of XOR are the following:
         * XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
         * XOR of a number with 0 will result in the number itself i.e.
         * 0 ^ a = a. ←Property 2
         * Approach
         * We will just perform the XOR of all elements of the array using a
         * loop and the final XOR will be the answer.
         */

        int result=arr[0];  // a result variable initial valued to first element of array
        for(int i=1;i<n;i++){  // loop initiated where result is xor with all other elements of the array
            result^=arr[i];
        }
        // Hence the
        System.out.println(result);

    }
}
