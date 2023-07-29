package mathematics.salaryBonus;

public class SalaryBonus {

    public long[] bonus(int[] arr, long s) {
        //Вычисление бонусов сотрудникам, исходя из количества дней, которые работник отсутствовал на рабочем месте
        //Массив arr - количество пропусков
        //Размер массива arr - количество сотрудников
        //S - общее количество премиальных для всех сотрудников

        long [] a = new long[arr.length];           //Массив премиальных для каждого сотрудника
        double sum = 0.0;                           //Промежуточная переменная, необходимая для вычислений
        long big;                                   //Промежуточная переменная, необходимая для вычислений

        for (int i = 0; i < arr.length; i++)
            sum += arr[0] / (double)arr[i];

        a[0] = (long)Math.round(s / sum);
        big = a[0] * arr[0];

        for (int i = 1; i < arr.length; i++)
            a[i] = big / arr[i];

        return a;
    }

}
