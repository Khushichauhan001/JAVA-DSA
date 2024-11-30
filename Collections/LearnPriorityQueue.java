package Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>();  
        //  pq.offer(12);
        //  pq.offer(24);
        //  pq.offer(2);
        //  pq.offer(67);
        //  System.out.println(pq);  // print acc to min heap (sbse chota bala sbse aayga bs )
         

        //  pq.poll();
        //  System.out.println(pq);

        //  System.out.println(pq.peek());


        //NOW lets prioritize our greater element
        // it convert min heap to max heap directly 
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
          pq.offer(12);
         pq.offer(24);
         pq.offer(2);
         pq.offer(67);
         System.out.println(pq);  // print acc to min heap (sbse chota bala sbse aayga bs )
         

         pq.poll();
         System.out.println(pq);

         System.out.println(pq.peek());

    }
}
