package other.validBoomerang;

public class ValidBoomerang {

    public boolean isBoomerang(int[][] points) {

        if (
                ((points[2][0] - points[0][0]) * (points[1][1] - points[0][1])) ==
                ((points[2][1] - points[0][1]) * (points[1][0] - points[0][0]))
        )
            return false;

        for (int i = 0; i < points.length - 1; i++)
            for (int j = i; j < points.length - 1; j++)
                if ((points[i][0] == points[j + 1][0]) && (points[i][1] == points[j + 1][1]))
                    return false;

        return true;
    }
}
