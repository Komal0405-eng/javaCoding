import java.util.*;

public class HollowDiamond {

    public static void printHollowDiamond(int n) {
        int mid = (n + 1) / 2;

        // Upper Half
        for (int i = 1; i <= mid; i++) {
            // spaces
            for (int s = 1; s <= mid - i; s++) {
                System.out.print("  ");
            }

            if (i == mid) {
                // Middle row
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + "  ");
                }
                for (int j = n - 1; j >= 1; j--) {
                    System.out.print(j + "  ");
                }
            } else if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print("1");
                int innerSpaces = 2 * i - 3;
                for (int s = 1; s <= innerSpaces; s++) {
                    System.out.print("  ");
                }
                System.out.print(i);
            }

            System.out.println();
        }

        // Lower Half
        for (int i = mid - 1; i >= 1; i--) {
            // spaces
            for (int s = 1; s <= mid - i; s++) {
                System.out.print("  ");
            }

            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print("1");
                int innerSpaces = 2 * i - 3;
                for (int s = 1; s <= innerSpaces; s++) {
                    System.out.print("  ");
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

        if (n % 2 == 0 || n < 1) {
            System.out.println("Please enter odd number.");
        } else {
            printHollowDiamond(n);
        }
    }
}
