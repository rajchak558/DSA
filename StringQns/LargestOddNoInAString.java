package String_questions;

import java.util.HashSet;

/*Problem Statement: Given a string s, representing a large integer,
the task is to return the largest-valued odd integer (as a string) that
is a substring of the given string s.
The number returned should not have leading zero's. But the given input
string may have leading zero.
Example 1
Input:
 s = "5347"
Output:
 "5347"
Explanation:
 The odd numbers formed by the given string are → 5, 3, 53, 347, 5347.
 The largest odd number without leading zeroes is 5347.

Example 2
Input:
 s = "0214638"
Output:
 "21463"
Explanation:
 The odd numbers formed by the string are → 1, 3, 21, 63, 463, 1463, 21463.
 We can't use numbers starting with 0, so the largest valid odd number is
 21463.*/
public class LargestOddNoInAString {
    public static void main(String args[]){
        String word="0001200100002146346839642";
        String result=optimal_solution(word);
        System.out.println(word+"\n"+result);
    }
    public static String solution_bruteforce(String word){
        //HashSet<Integer> set= new HashSet<>();
        int start=0;
        for (int a=0;a<word.length()-1;a++){
            if(word.charAt(a)=='0'){
                start+=1;
            }
        }
        //System.out.println(start);
        int max=0;
        for (int i=start;i<word.length();i++){
            int tem=0;
            for(int j=i;j<word.length();j++){
                char temp=word.charAt(j);
                System.out.println(temp);
                int num=temp-'0';
                tem=(10*tem)+num;

                if(tem>max && tem%2==1){
                    max=tem;
                }

            }
            System.out.println(tem+"------"+max);
        }
        //System.out.println(max);

        return null;
    }
    public static String optimal_solution(String word){
        int flag=0;
        //int i=0,j=0;
        //String result="";
        /*First I depicted in the whole string from the starting which
        one is the non zero integer,placed marker left Then from the '
        last I searched for the odd element,placing right. Then I returned
        the substring within markers left and right */
        int left=0,right=word.length()-1;
        int num1=word.charAt(left)-'0';
        int num2=word.charAt(right)-'0';
        System.out.println(num1+" HI "+num2);
        while(num1==0 || num2%2==0){
            num1=word.charAt(left)-'0';
            num2=word.charAt(right)-'0';
            System.out.println(num1+" HI "+num2);
            if(num1==0){
                left++;
            }
            if(num2%2==0){
                right--;
            }

            }
        return word.substring(left,right+1);
        }

    }

