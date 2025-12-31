import java.util.*;

public class Chocola {

    public static int minCost(Integer[] costHor, Integer[] costVer) {

        // Sort costs in descending order
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;   // horizontal and vertical pieces
        int cost = 0;

        // Process both cuts
        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] >= costVer[v]) {
                cost += costHor[h] * vp;
                hp++;
                h++;
            } else {
                cost += costVer[v] * hp;
                vp++;
                v++;
            }
        }

        // Remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        // Remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        return cost;
    }

    public static void main(String[] args) {

        Integer[] costHor = {4, 1, 2};
        Integer[] costVer = {2, 1, 3};

        int result = minCost(costHor, costVer);
        System.out.println("Minimum cost = " + result);
    }
}
