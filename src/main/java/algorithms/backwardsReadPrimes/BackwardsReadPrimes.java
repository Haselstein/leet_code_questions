package algorithms.backwardsReadPrimes;

import java.util.ArrayList;

public class BackwardsReadPrimes {

    public String backwardsReadPrimes(long start, long end) {
        // Нахождение "обратных" простых чисел в диапазоне от start до end.
        // Обратные простые - это такие простые числа,
        // которые при обратном чтении (справа налево) дают простое число (13).
        // Например: start = 2, end = 100
        // В этом диапазоне удовлетворять условиям будут такие простые числа:
        // [13, 31, 17, 71, 37, 73, 79, 97]

        ArrayList<String> answer = new ArrayList<>();

        for (long i = start; i <= end; i++)
            if (isPrime(i))
                if (isBackwardPrime(i))
                    answer.add(String.valueOf(i));

        if (answer.isEmpty())
            return "";

        return answer.stream().reduce((x, y) -> x + " " + y).get();
    }

    public boolean isBackwardPrime(long value) {
        //Метод проверки числа на обратное простое, на то, что это не однозначное число и на то, что это не палиндром
        return isPrime(inverse(value)) && value != inverse(value);
    }

    public long inverse(long value) {
        //Обратная запись числа

        long result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }

        return result;
    }

    public boolean isPrime(long a) {

        if (a < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a%i == 0)
                return false;

        return true;
    }

}
