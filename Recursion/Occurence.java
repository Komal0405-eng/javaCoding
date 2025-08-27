public class Occurence {
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return i;
    
    }
    if(arr[i] == key){
        return i;
    }
    return firstOccurence(arr, key, i+1);
} 
public static void main(String args[]){
    int arr[] = {4,5,6,7,2 ,6, 7 ,9};
    System.out.println(firstOccurence(arr, 5, 0));

}    }