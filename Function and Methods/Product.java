public class Product{
    public static int multiply(int a, int b) {
        int product = a * b;
       return product;
    } 
    public static void main(String args[]) {
        int a=10;
        int b=15;
        int prod= multiply(a,b);
        System.out.println("a * b = " + prod);
        prod = multiply( 200,30);
        System.out.println("a * b = " + prod);
    }
}