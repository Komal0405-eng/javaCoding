public class Sum {
    public static void main(String args[]) {
        int[][] nums = {
            {5, 2, 6},
            {10, 3, 7},
            {8, 1, 4}
        };
        int sum = 0;

        // Sum of 2nd row 
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }

        System.out.println("Sum is: " + sum);
    }
}
