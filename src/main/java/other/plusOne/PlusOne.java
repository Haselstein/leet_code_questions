package other.plusOne;

public class PlusOne {
    /*
    На вход подаётся массив, состоящий из цифр числа, например число 156 -> [1, 5, 6].
    Нужно к данному числу прибавить единицу и вернуть такой же массив цифр числа.
    Только положительные числа.
     */

    public int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] number = new int[n+1];
        number[0] = 1;

        return number;

    }

}
