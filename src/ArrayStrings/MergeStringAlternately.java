package ArrayStrings;

import java.util.ArrayList;
import java.util.List;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String word1= "abc";
        String word2= "crb";
        System.out.println(mergeAlternately(word1,word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        List<Character> solution = new ArrayList<>();
        int A = word1.length();
        int B = word2.length();
        int a = 0,b = 0;

        int word = 1;
        while (a < A && b < B){
            if (word == 1){
                solution.add(word1.charAt(a));
                a++;
                word = 2;
            }
            if (word == 2){
                solution.add(word2.charAt(b));
                b++;
                word = 1;
            }
        }
        while (a < A){
            solution.add(word1.charAt(a));
            a++;
        }
        while (b < B){
            solution.add(word2.charAt(b));
            b++;
        }
        return solution.toString().replace("[","").replace("]","").replaceAll(",","").replaceAll(" ","");
    }
}
