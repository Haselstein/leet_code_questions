package other.reverse;

public class Reverse {

    public int reverse(int x) {
        // Число задом наперёд

        int result = 0;
        int value = Math.abs(x);

        while(value > 0) {
            if (result > (Integer.MAX_VALUE/10))
                return 0;
            result = result * 10 + value % 10;
            value /= 10;
        }

        if (x < 0)
            result = -result;

        return result;
    }

}
