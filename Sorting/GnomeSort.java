public class GnomeSort {
    public static void gnomeSort(int[] arr) {
        int index = 0;
        int n = arr.length;

        while (index < n) {
            if (index == 0 || arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        gnomeSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
