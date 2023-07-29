package algorithms.isPrime;

import java.util.stream.IntStream;

public class IsPrime {

    public boolean isPrime(int a) {
        //На вход поступает число, проверить, является ли оно простым
        //Все числа целые

        if (a < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a%i == 0)
                return false;

        return true;
    }

}
