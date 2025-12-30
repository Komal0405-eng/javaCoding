import java.util.Deque;
import java.util.ArrayDeque;

public class DoubleEndedQueue {

    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // add elements
        dq.addFirst(10);   // front
        dq.addLast(20);    // rear
        dq.addFirst(5);
        dq.addLast(30);

        System.out.println(dq); 

        // remove elements
        dq.removeFirst(); // removes 5
        dq.removeLast();  // removes 30

        System.out.println(dq); 

        // peek elements
        System.out.println(dq.peekFirst()); 
        System.out.println(dq.peekLast()); 
    }
}
