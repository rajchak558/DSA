package String_questions;
/*
* Given two strings s and goal, return true if and only if s can become goal
* after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost
* position. For example, if s = "abcde", then it will be "bcdea" after one
* shift.
* Example 1:
Input:
 s = "rotation", goal = "tionrota"
Output:
 true
Explanation:
 After multiple left shifts on "rotation", we get:
    1st shift → "otationr"
    2nd shift → "tationro"
    3rd shift → "ationrot"
    4th shift → "tionrota"
    So the goal string can be obtained by rotating the original string.

Example 2:
Input:
 s = "hello", goal = "lohelx"
Output:
 false
Explanation:

Even after all possible rotations of "hello", we cannot form "lohelx"
* due to the presence of an extra character 'x'. Hence, it's not possible.*/
public class CheckIfTwoStringsAreRotation {
    public static void main(String args[]){
        String original="hello";
        String testcase="gello";
        boolean result=solution_optimal(original,testcase);
        System.out.println("The string are rotaton :"+result);
    }
    public static boolean solution_bruteforce(String actual,String test){
        String temp="";
        for(int i=1;i<actual.length();i++){
            temp=actual.substring(i)+actual.substring(0,i);
            System.out.println(temp);
            if(temp.equals(test)){
                return true;
            }
        }
        return false;
    }
    public static boolean solution_optimal(String actual,String test){
        String temp=actual+actual; // let for actual=lopelo temp=lopelolopelo
        //System.out.println(temp+" "+temp.length());
        int end=actual.length()+1;//
        for(int i=1;i<actual.length();i++){
            //System.out.println(temp.substring(i,end));
            if(temp.substring(i,end).equals(test)){
                return true;
            }
            end++;
        }
        return false;
    }
}
