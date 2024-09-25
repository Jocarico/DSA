package ArrayStrings;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int point = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < t.length(); j++){
                char letterS = s.charAt(i);
                char letterT = t.charAt(j);
                if (letterT == letterS){
                    point++;
                    break;
                }
            }

        }
        if(point != s.length()){ return false;}
        else{ return true;}
    }}
