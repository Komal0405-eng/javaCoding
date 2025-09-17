public class Ques12{
    static int product(int[] arr, int n) {
        if (n == 0)
            return 1; 
        return arr[n - 1] * product(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4 };
        System.out.println("Product: " + product(arr, arr.length));
    }
}
