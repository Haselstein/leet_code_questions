package algorithms.playingWithDigits;

public class PlayingWithDigits {

    public int playingWithDigits(int num, int n) {
        //На вход поступает число и номер первой степени.
        //Нужно разложить число на его цифры.
        //Слева направо возвести каждую цифру в степень n + порядковый номер.
        //Просуммировать все числа. Если сумма делится нацело на изначальное число, то вернуть результат деления.
        //Иначе вернуть -1.
        //Например:
        //(695, 2): 6^2 + 9^3 + 5^4 = 1390 = 695*2 -> вернуть 2

        int sum = 0;
        int i = (int) (Math.log10(num));
        int sourceNum = num;

        while (num > 0) {
            sum += (int) Math.pow((num%10), (n+i));
            num /= 10;
            i--;
        }

        if (sum%sourceNum == 0) {
            return sum/sourceNum;
        }

        return -1;
    }

}
