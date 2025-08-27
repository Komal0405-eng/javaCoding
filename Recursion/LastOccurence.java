public class LastOccurence {
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        // Recursive call
        int isFound = lastOccurence(arr, key, i + 1);

        // If found in the rest of the array, return that
        if (isFound != -1) {
            return isFound;
        }

        // If not found later, check current
        if (arr[i] == key) {
            return i;
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 6, 8, 7, 2, 5 };
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
