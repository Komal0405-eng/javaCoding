import java.util.*;

public class JobSequence {

    static class Job {
        char id;
        int deadline, profit;

        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('a', 4, 20),
            new Job('b', 1, 10),
            new Job('c', 1, 40),
            new Job('d', 1, 30)
        };

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        boolean[] slot = new boolean[10];
        char[] result = new char[10];

        for (Job job : jobs) {
            for (int j = job.deadline; j > 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    break;
                }
            }
        }

        for (int i = 1; i < result.length; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
    }
}
