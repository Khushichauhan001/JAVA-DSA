public class DeleteInDLL {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head == null) return null ;
        
        Node temp = head ;
      if(x== 1){
          head = head.next;
             if(head != null ){
                 
          head.prev = null;
          }
          return head ;
      }
    
      
      for(int i=1 ;i<x-1 && temp.next!= null;i++){
        temp= temp.next;
      }
        // Case 2: If deleting the last node
        if (temp.next.next == null) {
            temp.next = null;
            return head;
        }
         temp.next = temp.next.next;
         temp.next.prev = temp ;
         
        return head;
    }
}
