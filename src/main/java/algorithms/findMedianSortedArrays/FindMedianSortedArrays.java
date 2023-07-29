package algorithms.findMedianSortedArrays;

import java.util.Arrays;

public class FindMedianSortedArrays {

    public float findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Медианное (срединное) значение в отсортированном объединении двух массивов

        int fal = nums1.length; // first array length
        int sal = nums2.length; // second array length

        int[] result = new int[fal + sal];

        System.arraycopy(nums1, 0, result, 0, fal);
        System.arraycopy(nums2, 0, result, fal, sal);
        Arrays.sort(result);

        float answer;

        if (result.length %2 == 1)
            answer = result[(result.length-1) / 2];
        else
            answer = (float) ((result[result.length / 2] + result[(result.length / 2) - 1]) / 2.0);

        return answer;
    }

}
