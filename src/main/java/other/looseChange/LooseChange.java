package other.looseChange;

import java.util.HashMap;

public class LooseChange {

    public HashMap<String, Integer> looseChange(int cent) {
        // На вход подаётся количество центов
        // Нужно произвести размен на монеты

        HashMap<String, Integer> map = new HashMap<>();//Возможно, можно сделать инициализацию сразу в ретёрне

        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);

        if (cent <= 0)
            return map;

        map.put("Quarters", cent / 25);
        map.put("Dimes", cent %25 / 10);
        map.put("Nickels", cent %25 %10 / 5);
        map.put("Pennies", cent %25 %10 %5);

        return map;
    }

}
