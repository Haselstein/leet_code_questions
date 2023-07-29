package algorithms.minPartitions;

public class MinPartitions {

    public int minPartitions(String n) {
        // Нахождение минимальной длины суммы разложения числа, слагаемые которой состоят только из чисел 0 и 1
        // Например:
        //      Вход: 32
        //      Выход: 3
        //      Так как 32 = 10 + 11 + 11

        int result = 0;

        for (int i = 0; i < n.length(); i++)
            result = Math.max(result, n.charAt(i) - '0');

        return result;
    }

}
