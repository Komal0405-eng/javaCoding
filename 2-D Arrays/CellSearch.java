import java.util.*;

public class CellSearch {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell(" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 elements for 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output matrix
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    
        search(matrix, 5);
    }
}
