public class ReverseString {
    public static void main(String[] args) {
        String str = "SUNIL";
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse+str.charAt(i);


        }
        System.out.println("original string "+ str);
        System.out.println("reverse string "+reverse);

    }

}
