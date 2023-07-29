package mathematics.myPow;

public class MyPow {

    public double myPow(double x, int n) {
        // Возведение числа в степень

        if (n == 0)
            return 1;

        double answer = 1;
        byte flag = 0;

        // Если степень числа отрицательная
        if (n < 0) {
            flag = 1;
            n = -n;
        }

        for (int i = 0; i < n; i++)
            answer *= x;

        if (flag == 1)
            answer = 1/answer;

        return answer;
    }

}
