import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule1 {
     public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0 ;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int m = prerequisites.length;
        for(int i=0 ;i< m;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] indegree = new int[numCourses];
        for(int i=0 ;i< numCourses ;i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q1 = new LinkedList<Integer>();
        for(int i=0;i< numCourses ;i++){
            if(indegree[i] == 0){
                q1.add(i);
            }
        }

        List<Integer> l1 = new ArrayList<>();
        while(!q1.isEmpty()){
            int node = q1.peek();
            q1.remove();
            l1.add(node);

            for(int it : adj.get(node)){
                indegree[it]-- ;
                if(indegree[it] == 0) q1.add(it);
            }
        }
        if(l1.size() ==  numCourses ) return true ;
        return false ;
    }
}
