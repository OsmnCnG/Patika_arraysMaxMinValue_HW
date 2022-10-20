

public class MaxMin {


    static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] <= min) {
                min = array[i];

            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;

    }
}