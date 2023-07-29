package strings.inArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InArray {

    public String[] inArray(String[] array1, String[] array2) {
        //Метод возвращает массив строк, каждый элемент которого является
        //вхождением элементов массива array1 в любой из элементов массива array2.
        //Результат отсортирован и без дубликатов
        //Например:
        // array1 = { "arp", "live", "strong" }
        // array2 = { "harp", "karp", "alive", "stronger" }
        // result = { "arp", "live", "strong" }

        ArrayList<String> result = new ArrayList<String>();

        for (String s : array2)
            for (String string : array1)
                if (s.contains(string))
                    result.add(string);

        Collections.sort(result);

        List<String> newResult = result.stream().distinct().toList();

        String[] answer = new String[newResult.size()];
        for (int i = 0; i < newResult.size(); i++)
            answer[i] = newResult.get(i);

        return answer;
    }

}
