package array.easy;
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.

public class TwoSum {
    public int[] solution(int[] arr, int target) {
        int[] array = new int[2];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target && i != j) {
                    array[0] = i;
                    array[1] = j;

                    arr[j] = 1000000000;
                    break;
                }
            }
        }
        return array;
    }
}
