package array.easy;

import java.util.Arrays;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//        You must implement a solution with a linear runtime complexity and use only constant extra space.
public class SingleNumber {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int find = arr[0];

        if (arr.length == 0)
            return 0;

        int temp = 0;
        int k = 0;

        for (int i = 1; i < arr.length; i++) {
            try {
                if (arr[i] != arr[k] && arr[i] != arr[i + 1]) {
                    temp = arr[i];
                    find = temp;
                }
                k++;

            } catch (Exception e) {
                find = arr[arr.length - 1];
            }
        }

        return find;

    }
}
