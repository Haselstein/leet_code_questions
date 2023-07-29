package algorithms.sumDigPow;

import java.util.ArrayList;
import java.util.List;

public class SumDigPow {

    public List<Long> sumDigPow(long a, long b) {
        //На вход подаются границы области значений
        //Нужно вернуть массив таких чисел, сумма цифр в степени их позиции в числе которых равна самому числу
        //Например 89 = 8^1 + 9^2 -> искомое
        //88 != 8^1 + 8^2 = 72 -> ненужное число

        ArrayList<Long> result = new ArrayList<Long>();

        for (long i = a; i <= b; i++)
            if (isEureka(i))
                result.add(i);

        return result;
    }

    public boolean isEureka(long a) {
        // Сумма цифр числа, возведённых в степень своей позиции в числе

        long sum = 0;
        int i = (int) (Math.log10(a) + 1); //Количество цифр в числе
        long sourceNum = a;

        while (a > 0) {
            sum += (long) Math.pow((a%10), i);
            a /= 10;
            i--;
        }

        return sum == sourceNum;
    }

}
