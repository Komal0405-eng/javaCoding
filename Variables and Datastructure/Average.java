import java.util.Scanner ;
public class Average{
    public static void main(String arg[]){

     Scanner sc= new Scanner(System.in);
     int A ,B,C;
     float avg ;
     System.out.println("Enter A");
     A=sc.nextInt();
     System.out.println("Enter B");
     B=sc.nextInt();
     System.out.println("Enter C");
     C=sc.nextInt();
     avg = (A+B+C)/3 ;
     System.out.println("avg is " +avg );
    }
}