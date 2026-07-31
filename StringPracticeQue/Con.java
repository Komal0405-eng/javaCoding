public class Con {

    public static void main(String[] args) {
        String str = "Harshal";
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch !='a' && ch!='e' && ch!='o' && ch!='i' && ch !='u'){
                count++;
            }
        }
        System.out.println("Consonants:"+count);
    }
}