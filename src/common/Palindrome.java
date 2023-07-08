package common;

public class Palindrome {
    public static boolean execute() {
        String s = "A man, a plan, a canal: Panama  ";
        s = s.replaceAll("\\W","").replaceAll("_","").toLowerCase();
        boolean result = false;
        int strLength = s.length();
        if (strLength <= 1) {
            return true;
        } else {
            strLength--;
        }
        for (int i = 0; i < s.length()/2; i++) {
            result = s.charAt(i) == s.charAt(strLength - i);
            if (!result) break;
        }
        return result;
    }
}
