package ArrayStrings;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int S = s.length();
        int T = t.length();

        if(s == ""){
            return true;
        }
        if (S > T){ return false;}

        int j = 0;
        for (int i = 0; i < T; i++){
            if (t.charAt(i) == s.charAt(j)){
                j++;
            }
            if(j == S){
                return true;
            }

        }
        return false;

    }

}
