package LinkedList;
// import java.util.*;

// leetcode - 21
//  brute approac where we need to take extra space 
class MergeSortedList {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { 
        this.val = val; 
      }
       ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next;
       }
   }

     public static ListNode MergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1 ;
        ListNode temp2 = list2 ;
        ListNode head = new ListNode(100);   // just temporary value dal di bd m head.next return kr dengi
        ListNode temp = head ;
        while(temp1!= null && temp2!= null)
          {

            if(temp1.val < temp2.val){
            ListNode a = new ListNode(temp1.val);
            temp.next = a ;
            temp = a ;
            temp1 = temp1.next ;
          }
          else {
            ListNode a = new ListNode(temp2.val);
            temp.next = a ;
            temp = a ;
            temp2 = temp2.next ;
          }
    }

    if(temp1 == null){
        temp.next = temp2;   //new list m temp ko temp2 k bche hue value se direct add krdo 
    }
    else {
        temp.next = temp1 ;
    }
    return head.next ;
     }


     public static void printList(ListNode head ){
      ListNode temp = head ;
         while(temp!=null){
          System.out.println(temp.val);
          temp = temp.next ;
           
         }
         System.out.println();
     }

     public static void main(String[] args) {
      
      ListNode list1 = new ListNode(1);
      list1.next = new ListNode(2);
      list1.next.next = new ListNode(4);


      ListNode list2 = new ListNode(2);
      list2.next = new ListNode(4);
      list2.next.next = new ListNode(6);

      ListNode mergedList = MergeTwoLists(list1, list2);
      printList(mergedList);
     }


  }



