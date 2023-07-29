package mathematics.mySqrt;

public class MySqrt {

    public int mySqrt(int x) {
        // Нахождение целочисленного квадратного корня, округлённого в меньшую сторону

        if (x <= 0)
            return 0;
        if (x == 1)
            return 1;

        double t;
        double squareroot = (double) x / 2;

        do {
            t = squareroot;
            squareroot = (t + (x / t)) / 2;
        } while ((t - squareroot) != 0);

        return (int) squareroot;
    }

}
