public class Ques7 {
    
    public static void reverse(String str, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(str.charAt(index));
        reverse(str, index - 1); 
    }

    public static void main(String[] args) {
        String s ="abcd";
        System.out.print("Reversed string: ");
        reverse(s, s.length() - 1);
    }
}
