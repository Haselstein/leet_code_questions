package mathematics.multiples;

public class Multiples {

    public int multiples(int number) {
        //Складывает все числа, кратные 3 или 5, вплоть до number не включительно

        if (number < 0)
            return 0;

        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i %3 == 0 || i %5 == 0)
                sum += i;
        }

        return sum;
    }

}
