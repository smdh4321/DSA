package strings;

import java.util.HashSet;

public class LongestSubarrayWithoutRepCharsCount {
    static int longestSubarrayWithoutRepCharsCount(String str) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, res = 0;

        while (j < str.length()) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                res = Math.max(res, j - i + 1);
                j++;
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcdabcaaa";
        System.out.println(longestSubarrayWithoutRepCharsCount(str));
    }
}
