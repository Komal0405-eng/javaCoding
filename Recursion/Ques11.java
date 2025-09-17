public class Ques11 {
    public static void printBinary(int n) {
        if (n == 0) {
            return;
        }
        printBinary(n / 2);
        System.out.print(n % 2); 
         }

    public static void main(String[] args) {
        int num = 13;
        System.out.print("Binary of " + num + " : ");
        printBinary(num); 
    }
}
