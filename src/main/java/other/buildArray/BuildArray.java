package other.buildArray;

public class BuildArray {

    public int[] buildArray(int[] nums) {
        // Создание нового массива, элементами которого являются перестановки входного массива.
        // Перестановка: result[i] = nums[nums[i]].
        // Вход: nums = [0,2,1,5,3,4].
        // Результат: result = [0,1,2,4,5,3].

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++)
            result[i] = nums[nums[i]];

        return result;
    }

}
