package other.getConcatenation;

public class GetConcatenation {

    public int[] getConcatenation(int[] nums) {
        // Конкатенация массива с самим собой
        // Например: [1, 2, 3] -> [1, 2, 3, 1, 2, 3]

        int[] result = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i+nums.length] = nums[i];
        }

        // Способ через потоки. Работает медленнее
        // return IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();
        return result;
    }

}
