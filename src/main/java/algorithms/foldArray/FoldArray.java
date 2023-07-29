package algorithms.foldArray;

public class FoldArray {

    public int[] foldArray(int[] array, int runs) {
        //"Сворачивание массива чисел"
        //На вход подаётся массив чисел
        //Нужно "сложить" пополам этот массив runs раз
        //Например массив чисел от 1 до 5 и runs = 1:
        // ([1, 2, 3, 4, 5], 1) -> [6, 6, 3]
        /*Step 1         Step 2        Step 3       Step 4       Step5
                             5/           5|         5\
                            4/            4|          4\
        1 2 3 4 5      1 2 3/         1 2 3|       1 2 3\       6 6 3
                ----*----      ----*          ----*        ----*        ----**/

        if (runs == 0 || array.length == 1)
            return array;

        int middleLength = (int)Math.round(array.length/2.0);
        int[] answer = new int[middleLength];


        for (int i = 0; i < middleLength; i++)
            answer[i] = array[i] + array[array.length-1-i];

        if (array.length %2 != 0)
            answer[answer.length-1] = array[middleLength-1];

        return foldArray(answer, --runs);
    }

}
