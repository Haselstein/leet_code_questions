package algorithms.sequence;

import static java.lang.Math.max;

public class Sequence {

    public int sequence(int[] arr) {
        // Найти максимальную сумму последовательности чисел в массиве.
        // Если нет значений или все они отрицательны - вернуть 0.

        int sum = 0;
        int maxSeq = 0;

        for (int j : arr) {

            maxSeq = max(0, maxSeq + j);
            sum = max(sum, maxSeq);

        }

        return sum;
    }

}
