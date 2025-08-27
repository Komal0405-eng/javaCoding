public class Que4 {
    public static void printIncreasing(int n) {
        if (n == 0) {
            return; 
        }

        printIncreasing(n - 1); 
        System.out.print(n + " "); 
    }

    public static void main(String[] args) {
        int number = 5;
        printIncreasing(number); 
    }
}
