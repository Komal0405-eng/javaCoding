
 import java.util.*;

public class Practice2 {
    
    public static void bubbleSorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSorting(arr);
        System.out.println("Sorted array:");
        printArr(arr);
        
        sc.close();
    }
}
