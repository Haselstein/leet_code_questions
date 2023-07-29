package other.sumParts;

public class SumParts {

    public int[] sumParts(int[] ls) {
        //Сумма чисел массива, начиная с конца, заканчивая нулём
        //Например:
        //ls = [0, 1, 3, 6, 10] result = [0]
        //ls = [0, 1, 3, 6]     result = [0, 10]
        //ls = [0, 1, 3]        result = [0, 10, 16]
        //ls = [0, 1]           result = [0, 10, 16, 19]
        //ls = [0]              result = [0, 10, 16, 19, 20]
        //ls = []               result = [0, 10, 16, 19, 20, 20]

        int[] result = new int[ls.length+1];

        for (int i = ls.length-1; i >= 0; --i)
            result[i] = result[i+1] + ls[i];

        return result;
    }

}
