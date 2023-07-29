package mathematics.persistance;

public class Persistence {

    public int persistence(long n) {
        //"Стойкость" числа. Количество итераций умножения цифр числа до 1 цифры
        //Пример: 999 --> 4 (9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, 1*2 = 2)

        if (n < 10)
            return 0;

        long result = n;
        int answer = 0;

        do {
            n = result;
            result = 1;
            answer++;
            while (n > 0) {
                result *= n%10;
                n /= 10;
            }

        } while (result > 9);

        return answer;
    }

}
