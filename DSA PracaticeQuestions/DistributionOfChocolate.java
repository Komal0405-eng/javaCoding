import java.util.Arrays;

public class DistributionOfChocolate {

    static int minDifference(int arr[], int m) {

        int n = arr.length;

        if (m == 0 || n == 0)
            return 0;

        if (n < m)
            return -1;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= n - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {

        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        System.out.println(minDifference(arr, m));
    }
}