package array.easy;

//Given an array nums of size n, return the majority element.
//
//        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.Arrays;

public class MajorityElement {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int half = (nums.length)/2;
        int current = nums[0];
        int counter = 1;


        for (int i = 0; i < nums.length; i++) {

            if( i != nums.length - 1 && current == nums[i + 1]){
                counter++;
                continue;
            }
            if(counter > half){
                return nums[i];
            }

            current = nums[i+1];
            counter = 1;
        }
        return 0;
    }
}
