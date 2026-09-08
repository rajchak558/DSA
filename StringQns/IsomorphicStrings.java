package String_questions;

import java.util.HashMap;

/*Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to
get t.
All occurrences of a character must be replaced with another character while
preserving the order of characters. No two characters may map to the same
character, but a character may map to itself.
Example 1
Input:
 s = "paper", t = "title"
Output:
 true
Explanation:
 The characters in "s" can be mapped one-to-one to characters in "t":
'p' → 't', 'a' → 'i', 'e' → 'l', 'r' → 'e'
Since the mapping is consistent and unique for each character,
the strings are isomorphic.

Example 2
Input:
 s = "foo", t = "bar"
Output:
 false
Explanation:
'f' → 'b' is fine, 'o' → 'a' for the first 'o', But the second 'o' in "s"
would need to map to 'r' in "t", which conflicts with the earlier mapping
of 'o' → 'a'
This inconsistency makes it impossible to convert "s" to "t" using a
one-to-one character mapping.*/
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s="foo";
        String t="baa";
        boolean result=solution_bruteforce(s,t);
        System.out.println("Isomorphic :"+result);
    }
    public static boolean solution_bruteforce(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
