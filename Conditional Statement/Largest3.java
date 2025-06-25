public class Largest3{
    public static void main(String args[]) {
        int A = 1, B = 3 , C = 9;
        if(( A >= B) && ( A >= C)) {
            System.out.println("A is largest");
        } 
        if ((B >= A ) && (B >= C )) {
            System.out.println("B is largest");

        } 
        if((C >= A) && ( C >= B)) {
            System.out.println("C is largest ");
        }
    } 
}