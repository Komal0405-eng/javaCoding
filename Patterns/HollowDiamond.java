import java.util.Scanner;

public class HollowDiamond {

    public static void printHollowDiamond(int n) {
        int mid = (n + 1) / 2;

        // Upper Half (including middle)
        for (int i = 1; i <= mid; i++) {
            // Print leading spaces
            for (int s = 1; s <= mid - i; s++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print("1");
            } else if (i == mid) {
                // Middle row: numbers with spaces in between
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
                for (int j = n - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                // Edge numbers with spaces between
                System.out.print("1");
                for (int s = 1; s <= (2 * i - 3); s++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }

        // Lower Half
        for (int i = mid - 1; i >= 1; i--) {
            // Leading spaces
            for (int s = 1; s <= mid - i; s++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print("1");
                for (int s = 1; s <= (2 * i - 3); s++) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            printHollowDiamond(n);
        }
        sc.close();
    }
}
