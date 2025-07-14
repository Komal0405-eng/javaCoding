public class BitonicSort {
    public static void bitonicSort(int[] arr, int low, int count, boolean dir) {
        if (count > 1) {
            int k = count / 2;
            bitonicSort(arr, low, k, true);
            bitonicSort(arr, low + k, k, false);
            bitonicMerge(arr, low, count, dir);
        }
    }

    public static void bitonicMerge(int[] arr, int low, int count, boolean dir) {
        if (count > 1) {
            int k = count / 2;
            for (int i = low; i < low + k; i++) {
                if (dir == (arr[i] > arr[i + k])) {
                    int temp = arr[i];
                    arr[i] = arr[i + k];
                    arr[i + k] = temp;
                }
            }
            bitonicMerge(arr, low, k, dir);
            bitonicMerge(arr, low + k, k, dir);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8, 1, 7}; // Size must be power of 2
        bitonicSort(arr, 0, arr.length, true);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
