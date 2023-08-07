package other.plusOne;

import java.util.ArrayList;

public class PlusOne {
    /*
    На вход подаётся массив, состоящий из цифр числа, например число 156 -> [1, 5, 6].
    Нужно к данному числу прибавить единицу и вернуть такой же массив цифр числа.
    Только положительные числа.
     */

    public int[] plusOne(int[] digits) {

        int result = 0;
        int j = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            result += (int) (digits[i] * (Math.pow(10, j)));
            j++;
        }
        result++;

        ArrayList<Integer> tempAnswer = new ArrayList<>();
        while (result > 0) {
            tempAnswer.add(result %10);
            result /= 10;
        }

        int[] answer = new int[tempAnswer.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = tempAnswer.get(tempAnswer.size()-i-1);

        return answer;

        /*
        // Возможно можно сделать через рекурсию
        if (digits[digits.length-1] == 9) {
            digits[digits.length - 2] += 1;
            digits[digits.length-1] = 0;
        }

        digits[digits.length-1] += 1;*/

    }

}
