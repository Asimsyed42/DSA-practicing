package assignment;

//https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/?envType=problem-list-v2&envId=array
//3184. Count Pairs That Form a Complete Day I

public class CountPairThatFormCompleteDay {
    static void main(String[] args) {
        int[]hours={72,48,24,3};
        System.out.println(countComplete(hours));
    }
    static int countComplete(int[]hours){
        int count=0;
        for(int i=0;i<hours.length;i++){
            for(int j=i+1;j<hours.length;j++){
                if(hours[i]+hours[j]==24 || hours[i]+hours[j]==48 || hours[i]+hours[j]==72 || hours[i]+hours[j]==96 || hours[i]+hours[j]==120 || hours[i]+hours[j]==144 || hours[i]+hours[j]==168){
                    count+=1;
                }
            }
        }
        return count;
    }
}
