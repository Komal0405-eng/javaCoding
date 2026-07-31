public class Palindrome {
    public static void main(String[] args) {
        String str = "PUJARI";
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);


        }
        System.out.println("Original String:"+str);
        System.out.println("Reverse String:"+rev);

        if(str == rev){
            System.out.println("It is palindrome");
            return ;
        }
        else{
            System.out.println("It is not palindrome");
        }
         
        
    }
}
