package mean_of_array;

public class MeanOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 100, 99, 98, 97, 96, 95};
        System.out.printf(String.valueOf(trimMean(arr)));
    }

    public static double trimMean(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        int removeCount = arr.length * 5 / 100;
        int sum = 0;
        for (int i = removeCount; i < arr.length - removeCount; i++) {
            sum += arr[i];
        }

        return sum / (double)(arr.length - 2 * removeCount);
    }

}
