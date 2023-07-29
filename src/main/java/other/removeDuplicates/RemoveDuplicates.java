package other.removeDuplicates;

public class RemoveDuplicates {

    public int removeDuplicates (int[] nums) {
        // Удаляет дубликаты, но ТОЛЬКО в отсортированном массиве.
        // Возвращает элемент, до которого нужно считывать массив новый массив без дубликатов.
        // Aka возвращает количество уникальных элементов

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                if (i != j) nums[i] = 0;
            } else
                nums[i] = 0;
        }

        return j+1;
    }

}
