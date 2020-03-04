// Javier Rubio
public class sortOfSort {
    public int m(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > sum) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            return sum;
        }
    }
}
