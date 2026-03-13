package assignment;

//https://leetcode.com/problems/earliest-time-to-finish-one-task/description/?envType=problem-list-v2&envId=array
//3683. Earliest Time to Finish One Task

public class EarliestTimeToFinishOneTask {
    static void main(String[] args) {
        int[][]tasks={
                {1,6},
                {2,3}
        };
        System.out.println(earliestTime(tasks));
    }
    static int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < tasks.length; i++) {
            int finishTime = tasks[i][0] + tasks[i][1];
            min = Math.min(min, finishTime);
        }
        return min;
    }
}
