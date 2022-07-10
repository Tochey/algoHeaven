package array.easy;

import java.util.Arrays;

public class ThirdMaxNumber {
    public int solutiono(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int between  = 0;
        int min = Integer.MIN_VALUE-1;


        for (int i = nums.length - 2; i >= 0; i--) {
            if(max != nums[i] ){
                if(between != 0  && between != nums[i]){
                    min = nums[i];
                }
                between = nums[i];

                if(min != Integer.MIN_VALUE-1){
                    return min;
                }
            }

        }

        if(min == Integer.MIN_VALUE-1){
            return max;
        }

        return max;
    }
}
