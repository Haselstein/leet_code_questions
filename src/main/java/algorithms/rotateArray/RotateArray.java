package algorithms.rotateArray;

public class RotateArray {
    // В заданном массиве "сдвинуть" числа на k шагов вправо

    public int[] rotate(int[] nums, int k) {

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            answer[(i+k)%nums.length] = nums[i];

        return answer;
    }

}
