import java.util.*;

public class ReversingKElements {

    public static void reverseK(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        int size = q.size() - k;
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(
            Arrays.asList(10,20,30,40,50,60,70,80,90,100)
        );

        reverseK(q, 5);
        System.out.println(q);
    }
}
