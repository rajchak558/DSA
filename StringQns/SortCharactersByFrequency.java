package String_questions;

import java.util.Arrays;
import java.util.HashSet;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String word="tree";
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            String s= String.valueOf(c);
            set.add(s);
        }
        String arr[]=new String[set.size()];
        int i=0;
        for(String s:set){
            arr[i]=s;
            i++;
        }
        Arrays.sort(arr);
        for(String s:arr){
            System.out.println(s);
        }
    }

}
