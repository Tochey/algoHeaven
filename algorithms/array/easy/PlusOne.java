package array.easy;

public class PlusOne {
//    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//    Increment the large integer by one and return the resulting array of digits.
public int[] solution(int[] arr) {
    int val = checkFor9s(arr);
    int[] array = new int[2];

    if (val > 0 && val == arr.length) {
        // initialize a new array
        int[] nums = new int[arr.length + 1];
        nums[0] = 1;

        return nums;

    }

    if(val == 0 && val == arr.length) {
        arr[val]= arr[val] + 1;
    }

    if (val < arr.length) {
        // iterate till unique val is found, then add 1 to it
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 9) {
                arr[i] = 0;
            } else {

                arr[i] = arr[i] + 1;
                break;
            }
        }
        return arr;

    }

    if (arr[arr.length - 1] != 9) {
        // no 9s were found, increments last value of array
        arr[arr.length - 1 ] = arr[arr.length - 1] + 1;

    }

    return array;
}

    public static int checkFor9s(int[] arr) {
        int counter = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 9) {
                counter++;
            } else {
                break;
            }
        }

        return counter;
    }
}
