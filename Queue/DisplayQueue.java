package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
 public static void main(String[] args) {
     Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        // System.out.println(q1);  // but it alos take extra time and extra space to prit 
        
        // rear -> 6 5 4 3 2 1 -> front 
        Queue<Integer> helper = new ArrayDeque<>();
        while(q1.size()>0){
            System.out.println(q1.peek());
          helper.add(q1.poll());  
        }
        // q1 = helper; 
        while(helper.size()>0){
            q1.add(helper.poll());
        }
 }   
}
