import java.util.*;
public class PossiblePair{ 
public static boolean pairSum1(ArrayList<Integer> list, int target){
    for(int i=0; i<list.size(); i++){
        for(int k=i+1; k<list.size(); k++){
            if(list.get(i) + list.get(k) == target){
                return true;

            }
        }
    }
    return false;


    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 50;
        System.out.println(pairSum1(list, target));

        
    }
}
