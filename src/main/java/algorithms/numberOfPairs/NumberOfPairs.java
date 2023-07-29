package algorithms.numberOfPairs;

import java.util.Arrays;

public class NumberOfPairs {

    public int numberOfPairs(String[] gloves) {
        //Имеется массив с разноцветными перчатками
        //Нужно посчитать и вернуть количество одноцветных пар

        int result = 0;

        Arrays.sort(gloves);

        int i = 0;//?

        while (i < gloves.length-1) {

            if (gloves[i].equals(gloves[i+1])) {
                result++;
                i += 2;
            } else {
                i++;
            }
        }

        return result;
    }

}
