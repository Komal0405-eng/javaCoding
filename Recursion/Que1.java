public class Que1 {
    public static int fact(int n){
        if(n ==0 || n == 1){
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
    public static void main(String args[]){
        int number = 5;
        int result = fact(number);
        System.out.println(number + " != "  +result );

    }
}
