package Collections;
import java.util.ArrayDeque;

public class LearnArrayDeque {
      public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);   // ye head m add krdega element ko 
        adq.offerLast(6);    // ye last m add krega normaller like offer
        adq.offer(67);
                           
        System.out.println(adq);


        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll()" + adq);

        System.out.println(adq.pollFirst());
        System.out.println("PollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);

  }
}
