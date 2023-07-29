package other.removeElement;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        // Перемещает выбранный элемент в конец массива.
        // Возвращает индекс, до которого нужно считывать массив без "удалённого" элемента.

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

}
