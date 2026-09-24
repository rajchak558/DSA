import java.util.*;

public class CheckIfPangram {


    /*A pangram is a sentence where every letter of the English alphabet appears at least once.

    Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.



    Example 1:

    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    Output: true
    Explanation: sentence contains at least one of every letter of the English alphabet.
    Example 2:

    Input: sentence = "leetcode"
    Output: false


    Constraints:

    1 <= sentence.length <= 1000
    sentence consists of lowercase English letters.*/
    public static boolean checkIfPangram(String sentence) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.substring(i, i + 1));
        }
        if (set.size() == 26)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        boolean st = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");

        System.out.println(st);
    }
}