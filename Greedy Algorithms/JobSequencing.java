import java.util.*;
public class JobSequencing{
    

    // Job class
    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {

        // jobInfo = {deadline, profit}
        int[][] jobInfo = {
            {4, 20},
            {1, 10},
            {1, 40},
            {1, 30}
        };

        // Create job list
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // Sort jobs by profit (descending)
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        // Job sequencing
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);

            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // Output
        System.out.println("Max jobs = " + seq.size());
        System.out.print("Job sequence: ");
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
    }
}

    
