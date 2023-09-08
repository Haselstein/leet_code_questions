package strings.ransomNote;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static boolean ransomNote(String ransomNote, String magazine) {

        Map<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {

            char c = magazine.charAt(i);

            if (magazineMap.containsKey(c))
                magazineMap.put(c, magazineMap.get(c) + 1);
            else
                magazineMap.put(c, 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            char c = ransomNote.charAt(i);

            if (magazineMap.containsKey(c) && magazineMap.get(c) > 0)
                magazineMap.put(c, magazineMap.get(c) - 1);
            else
                return false;
        }

        return true;
    }

}
