import java.util.Scanner;

public class Hourglass {

    public static void printhourglass(int n) {
        int totalRows = 2 * n - 1;

        for (int i = 1; i <= totalRows; i++) {
            int currentRow = i <= n ? i : totalRows - i + 1;

            // spaces
            for (int s = 1; s < currentRow; s++) {
                System.out.print("  ");
            }

            int peak = n - currentRow + 1;

            //ascending 
            for (int j = 1; j <= peak; j++) {
                System.out.print(j + " ");
            }

            //  descending 
            for (int j = peak - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number (1 to 49): ");
        int n = sc.nextInt();

        if (n < 1 || n > 49 || n % 2 == 0) {
            System.out.println(" Please enter an odd number between 1 and 49.");
        } else {
            printhourglass(n);
        }

    
    }
}
