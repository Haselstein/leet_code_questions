package strings.lengthOfLongestSubstring;

import java.util.HashMap;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        /*
        На вход подаётся строка.
        Из этой строки нужно найти самую длинную подстроку без повторяющихся символов.
         */

        if (s.isEmpty()) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0, j = 0; i < s.length(); ++i){

            if (map.containsKey(s.charAt(i)))
                j = Math.max(j,map.get(s.charAt(i))+1);
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);

        }

        return max;
    }

}
