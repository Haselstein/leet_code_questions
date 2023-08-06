package strings.intToRoman;

import java.util.ArrayList;

public class IntToRoman {

    public String intToRoman(int num) {

        if (num <= 0)
            return "Null";

        ArrayList<String> result = new ArrayList<>();
        int temp;

        while (num > 0) {
            if (num / 1000 != 0) {
                temp = num / 1000 * 1000;
                switch (num / 1000) {
                    case 1 -> result.add("M");
                    case 2 -> result.add("MM");
                    case 3 -> result.add("MMM");
                }
            } else if (num / 100 != 0) {
                temp = num / 100 * 100;
                switch (num / 100) {
                    case 1 -> result.add("C");
                    case 2 -> result.add("CC");
                    case 3 -> result.add("CCC");
                    case 4 -> result.add("CD");
                    case 5 -> result.add("D");
                    case 6 -> result.add("DC");
                    case 7 -> result.add("DCC");
                    case 8 -> result.add("DCCC");
                    case 9 -> result.add("CM");
                }
            } else if (num / 10 != 0) {
                temp = num / 10 * 10;
                switch (num / 10) {
                    case 1 -> result.add("X");
                    case 2 -> result.add("XX");
                    case 3 -> result.add("XXX");
                    case 4 -> result.add("XL");
                    case 5 -> result.add("L");
                    case 6 -> result.add("LX");
                    case 7 -> result.add("LXX");
                    case 8 -> result.add("LXXX");
                    case 9 -> result.add("XC");
                }
            } else {
                temp = num;
                switch (num) {
                    case 1 -> result.add("I");
                    case 2 -> result.add("II");
                    case 3 -> result.add("III");
                    case 4 -> result.add("IV");
                    case 5 -> result.add("V");
                    case 6 -> result.add("VI");
                    case 7 -> result.add("VII");
                    case 8 -> result.add("VIII");
                    case 9 -> result.add("IX");
                }
            }
            num -= temp;
        }

        return String.join("", result);
    }

}
