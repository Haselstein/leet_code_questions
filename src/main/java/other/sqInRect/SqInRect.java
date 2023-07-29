package other.sqInRect;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public List<Integer> sqInRect(int lng, int wdth) {
        //На вход подаются длина и ширина прямоугольника
        //Нужно вернуть массив квадратов, на которые можно разбить данный прямоугольник

        List<Integer> array = new ArrayList<>();

        while (lng > 0 && wdth > 0) {
            if (lng > wdth) {
                array.add(wdth);
                lng -= wdth;

            }
            else if (lng < wdth) {
                array.add(lng);
                wdth -= lng;
            }
            else {
                array.add(lng);
                lng = 0;
                wdth = 0;
            }
        }

        return array;
    }

}
