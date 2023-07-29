package mathematics.sumFractions;

public class SumFractions {

    public String sumFractions(int[][] l) {
        //Калькулятор дробей.
        //На вход подаётся двумерный массив,
        //элементы которого - дроби, представленные в виде {числитель, знаменатель}.
        //Найти сумму дробей

        if (l.length < 1)
            return null;

        if (l.length < 2)
            return "[" + l[0][0] + ", " + l[0][1] + "]";

        String answer;

        int[] a = new int[l.length];    //Массив всех знаменателей
        for (int i = 0; i < a.length; i++)
            a[i] = l[i][1];

        int b = findLeastCommonMultiple(a); //Общий знаменатель

        int temp_1; //i-й числитель
        int sum = 0;    //Сумма всех числителей
        for (int[] ints : l) {
            temp_1 = b / ints[1] * ints[0];
            sum += temp_1;
        }

        while (findGreatestCommonDivisor(sum, b) != 1) {//Сокращение дроби, если возможно
            int divider = findGreatestCommonDivisor(sum, b);
            sum /= divider;
            b /= divider;
        }

        if (sum %b == 0)
            answer = "" + (sum/b);
        else
            answer = "[" + sum + ", " + b + "]";

        return answer;
    }

    public int findGreatestCommonDivisor(int a, int b) {
        //Поиск наибольшего общего делителя двух чисел

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int findLeastCommonMultiple(int[] sourceNumbers) {
        //Поиск наименьшего общего кратного массива чисел

        int result = sourceNumbers[0];

        if (result != 0) {
            for (int i = 1; i < sourceNumbers.length; i++) {
                if (sourceNumbers[i] == 0)
                    break;
                result = findLeastCommonMultiple(result, sourceNumbers[i]);
            }
        }

        return result;
    }

    public int findLeastCommonMultiple(int a, int b) {
        //Поиск наименьшего общего кратного двух чисел
        return a * (b / findGreatestCommonDivisor(a, b));
    }

}
