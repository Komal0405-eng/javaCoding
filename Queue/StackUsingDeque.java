import java.util.Deque;
import java.util.ArrayDeque;

public class StackUsingDeque {

    Deque<Integer> dq = new ArrayDeque<>();

    void push(int data) {
        dq.addFirst(data);
    }

    int pop() {
        if (dq.isEmpty()) {
            System.out.println("Stack is empty");
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
        StackUsingDeque stack = new StackUsingDeque();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());  
        System.out.println(stack.peek()); 
    }
}
