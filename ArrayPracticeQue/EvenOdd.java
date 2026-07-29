public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int evencount = 0;
        int oddcount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        
        System.out.println("Even numbers:"+evencount);
        System.out.println("Oddnumbers:"+oddcount);

    }
}
