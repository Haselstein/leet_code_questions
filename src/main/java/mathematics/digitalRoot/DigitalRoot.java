package mathematics.digitalRoot;

public class DigitalRoot {

    public int digital_root(int n) {
        //Цифровой корень.
        //Находит однозначное число по сумме исходных значений.
        //Пример: 982 -> 9+8+2 = 19 -> 1+9 = 10 -> 1+0 = 1

        if (n < 10)
            return n;

        int sum = 0;
        while (n >= 10) {
            sum += n%10;
            n /= 10;
        }

        sum += n;
        n = sum;

        return digital_root(n);
    }

}
