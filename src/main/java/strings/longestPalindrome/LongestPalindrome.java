package strings.longestPalindrome;

public class LongestPalindrome {

    private static int startPalindrome, maxLen;


    public String longestPalindrome(String s) {
        // Нахождение самого длинного палиндрома внутри строки

        if (s.length() <= 2) return s;

        for (int i = 0; i < s.length() - 1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }

        return s.substring(startPalindrome, startPalindrome + maxLen);
    }

    public void extendPalindrome(String s, int j, int k) {

        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (maxLen < k - j - 1) {
            startPalindrome = j + 1;
            maxLen = k - j - 1;
        }
    }

}
