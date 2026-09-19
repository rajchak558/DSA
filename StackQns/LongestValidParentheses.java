package Stack;

import java.util.Stack;

/*Given a string s consisting of opening and closing parenthesis '(' and ')'.
    Find the length of the longest valid parenthesis substring.

A parenthesis string is valid if:

For every opening parenthesis, there is a closing parenthesis.
The closing parenthesis must be after its opening parenthesis.
Examples :

Input: s = "((()"
Output: 2
Explanation: The longest valid parenthesis substring is "()".
Input: s = ")(()())"
Output: 4
Explanation: The longest valid parenthesis substring is "()()".
Input: s = "())()"
Output: 2
Explanation: The longest valid parenthesis substring is "()".
Constraints:
1 ≤ s.size() ≤ 106
s consists of '(' and ')' only*/
public class LongestValidParentheses {
    public static void main(String args[]){
        System.out.println("Length of longest valid :"+lengthOfLongest("())(()()((())))()()"));
    }
    public static int lengthOfLongest(String input){
        Stack<Integer>st=new Stack<>();// Defined a stack
        int top=0;
        int length=0;
        for (int i=0;i<input.length();i++){// traversing through the input parentheses
            if(input.charAt(i)=='('){
                st.push(i);// push the indx of '(' everytime
                top++;
            }
            else if(!st.isEmpty() && input.charAt(i)==')'){ // if stack is not empty and char=')'
                if(i-(int)st.peek()>length){
                    length=i-(int)st.peek();
                }
                //st.peek() contains the last index containing the ')' character
                // so i which is current index containing ')'
                //i-st.peek() will give the current longest valid parantheses length
                // Its required to pop as well
                st.pop();
                top--;
            }
            System.out.println(st);
        }
        return length+1;
    }
}
