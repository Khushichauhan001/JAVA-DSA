package GreedyAlgo;

import java.util.Arrays;


//gfg prblm 
public class NMeetings {
     public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length ;
        
        int[][] meetings = new int[n][2];
        for(int i=0 ; i<n  ;i++){
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }
        
        Arrays.sort(meetings, (a,b)-> a[1]-b[1]);
        
        int count =1 ;
        int endTime = meetings[0][1];
        
        for(int i= 1 ; i<n;i++){
            if(meetings[i][0] > endTime){
                count = count+1;
                endTime =meetings[i][1];
            }
        }
        return count ;
    }
}

//tc: 0(2N +NlogN);
//sc: 0(3N) + 0(N); 

//follow upques : find the pos of the meetings in thegiven array 
