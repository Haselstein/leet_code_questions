package strings.longestCommonPrefix;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        // Самый длинный префикс, одинаковый для всех слов из массива строк

        String answer = strs[0];
        int answerLenght = answer.length();

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(answer)) {
                answerLenght--;
                answer = answer.substring(0, answerLenght);
            }
        }

        return answer;
    }

}
