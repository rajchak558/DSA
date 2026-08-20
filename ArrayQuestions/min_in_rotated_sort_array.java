package arrayQuestions;/* Suppose an array of length n sorted in ascending order
is rotated between 1 and n times. For example,
the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]]
1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements,
return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
*/

public class min_in_rotated_sort_array {
    public static void main(String args[]){
        int arr[]={6,7,1,2,3,4,5};
        int min = binary_search_method_Ologn(arr);
        System.out.println("The minimum element of the subarray is: "+min);
    }
    public static int  binary_search_method_Ologn(int arr[]){
        // 6,7,1,2,3,4,5
        int min=arr[0]; //min= 6
        int left=0,right= arr.length-1;// r=6
        int mid=0;
        while(left<=right){
            // if 6 < 5 then
            // if 6 < 2
            if (arr[left]<arr[right])
            {
                min=Math.min(min,arr[left]);
            }
            mid=(left+right)/2;
            min=Math.min(min,arr[mid]);
            System.out.println(arr[mid]);

            if (arr[left]<=arr[mid]){ left=mid+1; }

            else { right = mid-1; }
            }
        return min;
        }
    }


