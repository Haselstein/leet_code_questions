package algorithms.productFib;

public class ProductFib {

    public long[] productFib(long prod) {
        // На вход подаётся число.
        // Нужно высчитать произведение рядом стоящих чисел фибоначчи.
        // Если есть произведение, равное этому числу, то вернуть эти 2 рядом стоящих числа фибоначчи и 1
        // Если число находится в границах между двумя произведениями чисел, то вернуть числа правой границы и 0
        /*
            Например:
             productFib(714) -> вернётся {21, 34, 1}, потому что 21 и 34 числа фибоначчи и их произведение равно 714
             productFib(800) -> вернётся {34, 55, 0}, потому что 21*34 < 800 < 34*55 то же самое, что 714 < 800 < 1870
        */

        long numberOne = 0;
        long numberTwo = 1;
        long temp;

        while (prod > numberOne * numberTwo) {
            temp = numberOne;
            numberOne = numberTwo;
            numberTwo += temp;
        }

        return new long[] { numberOne, numberTwo, numberOne * numberTwo == prod ? 1 : 0 };
    }

}
