public class Ques13 {
    static void printReverse(int[] arr, int n) {
        if (n == 0)
            return;
        System.out.print(arr[n - 1] + " ");
        printReverse(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        printReverse(arr, arr.length); 
    }
}
