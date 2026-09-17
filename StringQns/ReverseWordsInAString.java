package String_questions;
/*Problem Statement: Given an input string, containing upper-case and
lower-case letters, digits, and spaces( ' ' ). A word is defined as a
sequence of non-space characters. The words in s are separated by at least .
one space. Return a string with the words in reverse order,
concatenated by a single space.
* Input: s = "welcome to the jungle"
Output: "jungle the to welcome"
Explanation: The words in the input string are "welcome", "to", "the", and
"jungle". Reversing the order of these words gives
"jungle", "the", "to", and "welcome".
The output string should have exactly one space between each word.

Input: s = " amazing coding skills "
Output: "skills coding amazing"
Explanation: The input string has leading and trailing spaces,
as well as multiple spaces between the words "amazing", "coding", and "skills".
After trimming the leading and trailing spaces and reducing the multiple spaces
 between words to a single space, the words are "amazing", "coding", and
 "skills". Reversing the order of these words gives
 "skills", "coding", and "amazing".
 The output string should not have any leading or trailing spaces and should
 have exactly one space between each word.*/
public class ReverseWordsInAString {
    public static void main(String args[]){
        String word="welcome8 to the 6 jungle";
        String result=reverse(word);
        System.out.println(word+"\n"+result);
    }
    public static String reverse(String word){
        String temp="";
        String result="";
        for(int i=word.length()-1;i>=0;i--){
            char s=word.charAt(i);
            //System.out.println(s);
            if(s==' '){
                result+=temp;
                result=result+ " ";
                temp="";
            }
            else {
                temp = s + temp;
            }

        }
        result+=temp;
        //System.out.println(result);
        return result;
    }
}
