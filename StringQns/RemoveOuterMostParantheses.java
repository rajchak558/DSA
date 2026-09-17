package String_questions;
/*Problem Statement: A valid parentheses string is defined by the following
rules:

It is the empty string "".
If A is a valid parentheses string, then so is "(" + A + ")".
If A and B are valid parentheses strings, then A + B is also valid.

A primitive valid parentheses string is a non-empty valid string that cannot
be split into two or more non-empty valid parentheses strings.

Given a valid parentheses string s, your task is to remove the outermost
parentheses from every primitive component of s and return the resulting
string.
Example 1:
Input:
 s = "((()))"
Output:
 "(())"
Explanation:
 The input string is a single primitive: "((()))".
Removing the outermost layer yields: "(())".

Example 2:
Input:
 s = "()(()())(())"
Output:
 "(() ()) ()"
Explanation:
 Primitive decomposition: "()" + "(()())" + "(())"
After removing outermost parentheses: "" + "()()" + "()"
Final result: "( ()() )  ()".*/
public class RemoveOuterMostParantheses {
    public static void main(String[] args) {
        String par="()(()())(())";
        String trimmed=soluton_bruteforce(par);
        System.out.println("Trimmed string is "+trimmed);

    }
    public static String soluton_bruteforce(String par){
        return null;
    }
}
