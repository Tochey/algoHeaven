package array.easy;

import java.util.Arrays;

public class IntersectionOfArrays2 {
    public int[] solution(int[] arr1, int[] arr2) {
        int k = 0;
        // int bigLength = 0;
        if (arr1.length < arr2.length) {
            k = arr1.length;
            // bigLength = arr2.length;
        }

        if (arr2.length < arr1.length || arr2.length == arr1.length) {
            k = arr2.length;
            // bigLength = arr1.length;
        }

        int[] nums = new int[k];

        // int length = bigLength;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // int temp = 0;
        int p = 0;
        int counter = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] == arr2[j]) {
                    //if (!inArray(nums, arr1[i])) {
                    nums[p] = arr1[i];
                    arr1[i] = -10000;
                    arr2[j] = -10000;
                    p++;
                    counter++;
                    //}

                }
        }

        int[] nums1 = new int[counter];

        for( int y = 0; y < counter; y++) {
            nums1[y] = nums[y];
        }
        return nums1;
    }

    public static boolean inArray(int[] arr, int q) {
        boolean inArray = false;

        for (int i = 0; i < arr.length; i++) {
            if (q == arr[i]) {
                inArray = true;
            }
        }

        return inArray;
    }
}
