package strings.expandedNumber;

import java.util.ArrayList;
import java.util.Collections;

public class ExpandedNumber {

    public String expandedNumber(int a) {
        //Развёрнутая запись числа 'a' в виде строки
        // Например: 892 = 800 + 90 + 2

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<String> arrayString = new ArrayList<>();
        String b = null;
        int i = 0;

        while (a > 0) {
            if (a %10 != 0)
                array.add((int)(a%10 * (Math.pow(10,i))));

            a /= 10;
            i++;
        }

        array.sort(Collections.reverseOrder());

        for (Integer integer : array) arrayString.add(integer.toString());

        return String.join(" + ", arrayString);
    }

}
