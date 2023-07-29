package algorithms.countPairsInt;

public class CountPairsInt {

    public int countDivisors(int number) {
        //Подсчёт количества делителей числа number

        int result = 1; // = 1, чтобы учитывать само число

        for (int i = 1; i <= number/2; i++)
            if ((number % i) == 0)
                result++;

        return result;
    }

    public int countPairsInt(int diff, long nMax) {
        //Подсчёт количества таких чисел, разница между которыми равна diff,
        //не превышающие nMax, и имеющих одинаковое количество делителей

        int count = 0;

        for (int i = 1; i < nMax-diff; i++)
            if (countDivisors(i) == countDivisors(i+diff))
                count++;


        return count;
    }

}
