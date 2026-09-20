package Stack;
/*You are given an array arr[] of integers, the task is to find the next
greater element for each element of the array in order of their appearance
in the array. Next greater element of an element in the array is the nearest
element on the right which is greater than the current element.
If there does not exist next greater of current element, then next greater
element for current element is -1.

Examples

Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4,
since it doesn't exist, it is -1.

Input: arr[] = [6, 8, 0, 1, 3]
Output: [8, -1, 1, 3, -1]
Explanation: The next larger element to 6 is 8, for 8 there is no larger
elements hence it is -1, for 0 it is 1, for 1 it is 3 and then for 3 there is
no larger element on right and hence -1.

Input: arr[] = [1, 2, 3, 5]
Output: [2, 3, 5, -1]
Explanation: For a sorted array, the next element is next greater element also
except for the last element.

Input: arr[] = [5, 4, 3, 1]
Output: [-1, -1, -1, -1]
Explanation: There is no next greater element for any of the elements in the
array, so all are -1.

Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 109*/
import java.util.Stack;
public class NextLargerElement {
    public static void main(String args[]){
        int arr[]={1, 2, 3, 5};
        int[] res=nextLargerEle(arr);
        System.out.println("The result array");
        for (int i=0;i< res.length;i++){
            System.out.print(" "+res[i]);
        }


    }
    public static int[] nextLargerEle(int arr[]){
        Stack<Integer> st= new Stack<>();
        int result[]=new int[arr.length]; // array containing the result
        // to be initiated to -1
        for(int i=0;i< arr.length;i++){
            result[i]=-1;
        }
        for (int i= arr.length-1;i>=0;i--){
            if (i == arr.length-1){
                st.push(arr[i]);
                //result[i]=arr[i];
            }
            //8 10 0 1 3
            else {

                    if(arr[i]<=st.peek()){ // if array ele less than tos
                        result[i]=st.peek(); //next larger ele for that arr ele is tos
                        st.push(arr[i]); // push the arr ele to stack
                    }
                    else{ // if array ele greater than tos

                        while (arr[i]<st.peek()){
                            st.pop(); // Empty the stack
                        }
                        st.push(arr[i]);

                    }

            }
            System.out.println(st);
        }
        return result;
    }
}
 //NB test case 1 3 2 4 not running