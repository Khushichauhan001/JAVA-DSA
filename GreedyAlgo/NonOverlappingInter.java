package GreedyAlgo;
import java.util.Arrays;

public class NonOverlappingInter {
     public static int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) return 0 ;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));

        int count = 1 ;
        int endTime = intervals[0][1];
        
        for(int i=1 ; i<intervals.length ; i++){
            if(intervals[i][0] >= endTime){
                count = count+1;
                endTime = intervals[i][1];
            }
        }
        return intervals.length-count ;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));

    }
}
