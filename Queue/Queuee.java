package Queue ;

import java.util.*;

public class Queuee{
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println(q1);  //1234
         q1.remove();
         System.out.println(q1);   //234
         q1.poll();  //also work as remove
         System.out.println(q1);    //34
         
         //to show front element 
         System.out.println(q1.element());  // 3
         System.out.println(q1.peek());   // 3

         System.out.println(q1.size()); // 2
    }
}