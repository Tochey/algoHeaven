package array.easy;

import java.util.Arrays;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class ContainsDuplicates {
    public boolean solution(int[] arr) {
        boolean isDuplicate = false;

        if (arr.length == 0)
            return false;

        Arrays.sort(arr);

        int temp = 0;

        for( int i = 1; i < arr.length; i++) {

            if(arr[temp] == arr[i]) {
                isDuplicate = true;
            }
            temp++;
        }




        return isDuplicate;
    }
}
