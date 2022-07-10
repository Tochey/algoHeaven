package array.easy;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
public class MoveZeros {
    public void solution(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }

        if (arr[0] != 0) {

            int unique = arr[0];
            int index = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    unique = arr[j];
                    index++;
                }
                arr[index - 1] = unique;
            }

            int counter1 = arr.length - 1 - counter;

            for (int m = arr.length - 1; m > counter1; m--) {
                arr[m] = 0;
            }

        } else {
            int unique = arr[0];
            int index = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    unique = arr[j];
                    index++;
                    arr[index - 1] = unique;
                }

            }

            int counter1 = arr.length - 1 - counter;

            for (int m = arr.length - 1; m > counter1; m--) {
                arr[m] = 0;
            }

        }
    }
}
