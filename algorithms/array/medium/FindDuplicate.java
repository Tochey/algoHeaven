package array.medium;

import java.util.HashSet;
import java.util.Set;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and uses only constant extra space.
public class FindDuplicate {
    public int solutiono(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {

                set.add(arr[i]);
                continue;
            }
            return arr[i];
        }

        return 0;
    }
}
