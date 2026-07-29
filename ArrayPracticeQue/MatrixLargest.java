public class MatrixLargest {
    public static void main(String[] args) {

        int arr[][] = {
            {3, 7, 2},
            {9, 5, 1},
            {4, 8, 6}
        };

        int largest = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }

        System.out.println("Largest element= " + largest);
    }
}