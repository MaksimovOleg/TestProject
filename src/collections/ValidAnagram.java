package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {

    public static void main(String[] args) {
        String s = "nagram";
        String t = "margana";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        Map<Integer, Character> map = new HashMap<>();
        int length = s.length() - 1;
        for (int i = 0; i <= length; i++) {
            map.put(length - i, s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != map.get(i)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
