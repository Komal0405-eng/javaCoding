public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei); // merge both parts
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // copy remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // copy remaining right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp back to arr
        for (int m = 0; m < temp.length; m++) {
            arr[si + m] = temp[m];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 8, 9, 0, 2, 4 };
        System.out.println("Original Array:");
        printArr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArr(arr);
    }
}
