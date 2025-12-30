import java.util.Queue;
import java.util.LinkedList;

public class Interleave2half {

    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();

        int size = q.size();

        // move first half into another queue
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // interleave the two halves
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // from first half
            q.add(q.remove());         // from second half
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        interLeave(q);

       
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
