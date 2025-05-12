// import Implementation.linkedlist;
import java.util.*;

class ListNode{
    int val;
    ListNode next ;
    ListNode(){};
    ListNode(int val) {
        this.val = val ;
        this.next = null;
    }
    ListNode(int val, ListNode next){
        this.next = next;
        this.val = val;
    }
}
public class RotateList {
    static ListNode insertNode(ListNode head , int val){
      ListNode newnode = new ListNode(val);
      if(head == null ){
        head = newnode;
        return head ;
      }
      ListNode temp = head ;
      while(temp.next!= null){
        temp = temp.next ;

      }
      temp.next = newnode;
      return head ;
    }

    static void display(ListNode head ){
        while(head != null){
            System.out.print(head.val+ "->");
             head = head.next;
        }
        // System.out.println("null");
    }

    static  ListNode rotateRight(   ListNode head , int k){
        if(head == null || head.next == null || k==0){
            return head ;
        }
        ListNode temp = head ;
        int length = 1 ;
        while(temp.next!= null){
          length++;
          temp = temp.next;
        }
        temp.next= head;
        k= k%length;
        int end =length-k;

        while(end!= 0){
            temp=temp.next;
            end--;
        }
        
        head = temp.next;
        temp.next = null;

        return head ;

    }
public static void main(String[] args) {
    ListNode head =  null;
    head = insertNode(head, 1);
    head = insertNode(head, 2);
    head = insertNode(head, 3);
    head = insertNode(head, 4);
    head = insertNode(head, 5);

    System.out.println("Original List");
    display(head);

    int k=2 ;
    ListNode newHead = rotateRight(head, k);
    System.out.println();
    System.out.println("after"+ k+ "insertion");
    display(newHead);


}
}
