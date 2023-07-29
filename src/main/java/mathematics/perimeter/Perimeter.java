package mathematics.perimeter;

import java.math.BigInteger;

public class Perimeter {

    public BigInteger perimeter(BigInteger n) {
        // Прямоугольник разбит на квадраты.
        // На вход подаётся количество квадратов.
        // Стороны квадратов равны последовательности чисел Фибоначчи.
        // Нужно посчитать периметр прямоугольника.

        BigInteger f_0 = BigInteger.valueOf(1);
        BigInteger f_1 = BigInteger.valueOf(1);
        BigInteger sum = f_0.add(f_1);
        int l = n.intValue();

        for (int i = 3; i <= l+1; i++) {
            BigInteger temp = f_0.add(f_1);
            f_0 = f_1;
            f_1 = temp;
            sum = sum.add(f_1);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

}
