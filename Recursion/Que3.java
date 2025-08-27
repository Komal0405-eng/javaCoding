public class Que3{
    public static void printDecreasing(int n) {
        if (n == 0) {
            return; 
        }

        System.out.print(n + " "); 
        printDecreasing(n - 1); 
    }

    public static void main(String[] args) {
        int number = 5;
        printDecreasing(number); 
    }
}
