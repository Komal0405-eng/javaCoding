import java.util.*;

public class MinimumCost {

    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : arr) {
            pq.add(i);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int a = pq.remove();
            int b = pq.remove();
            int sum = a + b;
            cost += sum;
            pq.add(sum);
        }

        return cost;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        System.out.println(minCost(arr));
    }
}
