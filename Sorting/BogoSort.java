import java.util.Random;

public class BogoSort {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1] > arr[i]) return false;
        return true;
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void bogoSort(int[] arr) {
        while (!isSorted(arr))
            shuffle(arr);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        bogoSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
