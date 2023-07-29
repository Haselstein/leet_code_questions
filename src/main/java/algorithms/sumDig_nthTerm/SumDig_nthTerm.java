package algorithms.sumDig_nthTerm;

public class SumDig_nthTerm {

    public int sumDig_nthTerm(int initVal, int[] patternL, int nthTerm) {
        //Имеется последовательность:
        //1) term1 = initVal
        //2) term2 - term1 = k1
        //3) term3 - term2 = k2
        //4) term4 - term3 = k3
        //5) term5 - term4 = k4
        //...
        //Где [k1, k2, k3, k4, ...] = patternL
        //Найти сумму цифр числа nthTerm(порядковый номер числа последовательности (например "4)"))
        // в этой последовательности
        int i = 0;
        int n = 0;
        int nextNumber = initVal;

        while (n < nthTerm-1) {
            n++;
            nextNumber += patternL[i];

            if ((i+1) == patternL.length)
                i = 0;
            else
                i++;
        }

        return sumOfTheDigits(nextNumber);
    }
    public int sumOfTheDigits(int a) {
        //Сумма цифр числа

        int sum = 0;
        while(a > 0) {
            sum += a%10;
            a /= 10;
        }

        return sum;
    }

}
