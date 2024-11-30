package Collections;
import java.util.Queue;
import java.util.LinkedList;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
    
        // helps to add elements
        queue.offer(12);
        queue.offer(23);
        queue.offer(15);

        System.out.println(queue);

        // to remove element (FIFO) 

         System.out.println(queue.poll());

         System.out.println(queue);

         // peek elemets tell here ki konsa next element bahar nikalne wala h next 

         System.out.println(queue.peek());
    }
}
