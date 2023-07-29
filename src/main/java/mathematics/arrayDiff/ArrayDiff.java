package mathematics.arrayDiff;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayDiff {

    public int[] arrayDiff(int[] a, int[] b) {
        //Array diff. Вычитание матрицы b из матрицы a с сохранением порядка
        //Также сохраняет количество повторяющихся элементов(Нужно по заданию)
        //TODO Посмотреть решение через мап

        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<Integer> blist = new ArrayList<>();

        for (int k : a) alist.add(k);
        for (int k : b) blist.add(k);

        List<Integer> newList = blist.stream().distinct().toList();

        for (Integer integer : newList)
            for (int i = alist.size() - 1; i >= 0; i--)
                if (Objects.equals(alist.get(i), integer))
                    alist.remove(i);

        int[] result = new int[alist.size()];

        for (int i = 0; i < alist.size(); i++)
            result[i] = alist.get(i);

        return result;
    }

}
