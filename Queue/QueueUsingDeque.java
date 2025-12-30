import java.util.Deque;
import java.util.ArrayDeque;

public class QueueUsingDeque {

    Deque<Integer> dq = new ArrayDeque<>();

    void add(int data) {
        dq.addLast(data);
    }

    int remove() {
        if (dq.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return dq.removeFirst();
    }

    int peek() {
        if (dq.isEmpty()) {
            return -1;
        }
        return dq.peekFirst();
    }

    public static void main(String[] args) {
        QueueUsingDeque queue = new QueueUsingDeque();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.remove()); 
        System.out.println(queue.peek());  
    }
}
