package String_questions;

import java.util.Arrays;

/*
* Problem Statement: Write a function to find the longest common prefix
* string amongst an array of strings. If there is no common prefix, return
* an empty string ""
* Example 1
Input:
 str = ["flower", "flow", "flight"]
Output:
 "fl"
Explanation:
 All strings in the array begin with the common prefix "fl".

Example 2
Input:
 str = ["apple", "banana", "grape", "mango"]
Output:
 ""
Explanation:
 None of the strings share a common starting sequence, so the result is an empty string..*/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String []words={"flower","floer","flow","flihel","flowering"};
        String longest_prefix=solution_bruteforce(words);
        System.out.println("Longest prefix for this words is:"+longest_prefix);
    }
    public static String solution_bruteforce(String []v)
        {
            // To store the result prefix
            StringBuilder ans = new StringBuilder();
            // Sort the array of strings(Alphabetic sorting)
            Arrays.sort(v);

            //First string after sorting
            String first = v[0];

            //Last string after sorting
            String last = v[v.length - 1];
            System.out.println(first+" "+last);
            // Compare characters of the first and last strings
            for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
                // Stop if characters are different
                if (first.charAt(i) != last.charAt(i)) {
                    return ans.toString();
                }

                // Add matching character to result
                ans.append(first.charAt(i));
            }

            // Return the final common prefix
            return ans.toString();
        }
}
/*class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length()-1];
        for (int i=0;i<Math.min(first.length,last.length);i++){
            if(first.charAt(i)!=last.charAt()){
                return result;
            }
            result+=String.valueOf(first.charAt(i))
        }
        return result;
    }
}*/
