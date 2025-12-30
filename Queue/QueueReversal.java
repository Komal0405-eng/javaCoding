import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueReversal {

    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Step 1: move queue elements to stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // Step 2: move stack elements back to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);

        // print reversed queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
