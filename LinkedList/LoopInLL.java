import java.util.HashMap;
import java.util.Map;

class Node {
    int  data ;
    Node next ;

    Node(int data1 , Node next1){
        data = data1;
        next = next1;

    }

    Node(int data1){
        data = data1 ;
        next = null;
    }
}

public class LoopInLL {
    public static int LengthOfLoop(Node head ){
        Map<Node,Integer> mp = new HashMap<>() ;

        int timer = 0 ;
        Node temp = head ;

        while(temp!=null){
            if(mp.containsKey(temp)){
               int loopLength = timer - mp.get(temp);
               return loopLength;
            }
            mp.put(temp, timer);
            temp = temp.next ;
            timer++;

        }
        return 0 ;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        head.next = second ;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth ;
        fifth.next = sixth;
        sixth.next = second;

        int loopLength = LengthOfLoop(head);
 
        if(loopLength >0){
            System.out.println("Length of loop is :" + loopLength);
        }
        else{
            System.out.println("No loop found in the list ");
        }

    }
}

// its optimal soln from atoz