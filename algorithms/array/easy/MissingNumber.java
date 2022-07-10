package array.easy;

import java.util.Arrays;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
public class MissingNumber {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];

        if(arr.length == 1){
            if(arr[0] == 0){
                return 1;
            }else{
                return 0;
            }

        }

        if(arr[0] != 0){
            return 0;
        }

        for (int i = 1; i < arr.length; i++) {
            min += 1;
            if(min != arr[i]){
                return arr[i] - 1;
            }

        }
        return arr.length;
    }
}
