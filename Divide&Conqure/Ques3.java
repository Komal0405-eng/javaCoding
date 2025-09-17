
    
public class Ques3{

  
    public static int countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Count inversions in left half
            invCount += mergeSort(arr, left, mid);

            // Count inversions in right half
            invCount += mergeSort(arr, mid + 1, right);

            // Count inversions while merging
            invCount += merge(arr, left, mid, right);
        }
        return invCount;
    }

    // Merge two halves and count inversions
    private static int merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        int invCount = 0;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                invCount += (n1 - i); 
        }  }

        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];

        return invCount;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 1, 3, 5 };
        System.out.println("Inversion Count: " + countInversions(arr1)); 
        int[] arr2 = { 2, 3, 4, 5, 6 };
        System.out.println("Inversion Count: " + countInversions(arr2)); 

        int[] arr3 = { 5, 5, 5 };
        System.out.println("Inversion Count: " + countInversions(arr3)); 
    }
}
 