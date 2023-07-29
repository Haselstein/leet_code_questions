package other.findMissingNumber;

import java.util.Arrays;

public class FindMissingNumber {

    public int findMissingNumber(int[] numbers) {
        // Найти одно пропавшее число в массиве numbers.
        // Этот массив состоит из последовательных уникальных чисел от 1 до n.
        // Но эти числа разбросаны по массиву.
        // Например:
        //  {3, 7, 1, 8, 5, 2, 4} - > return 6

        int sum = 0;

        for (int i = 0; i <= numbers.length+1; i++)
            sum += i;

        return sum - Arrays.stream(numbers).sum();
    }

}
