package array.easy;

public class SearchInsertPosition {
//    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//    You must write an algorithm with O(log n) runtime complexity.
    public int solution(int[] nums, int target) {
        int start = 0;
        int end = 0;
        int midPoint = nums.length/2;

        if(target > nums[midPoint] ){
            start = midPoint;
            end = nums.length;
        }

        if(target < nums[midPoint]) {

            end = midPoint;
        }

        if(nums[midPoint] == target){
            return midPoint;
        }
        for ( int i = start; i < end; i++){
            if(nums[i] == target){
                return i;
            }

            try{
                if(target > nums[i] && target < nums[i+1]){
                    return i+1;

                }
            }catch(Exception e) {
                return nums.length ;
            }
        }
        return 0;
    }
}
