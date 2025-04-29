//leetcode 430 
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

 class isFlatten {
    public Node flatten(Node head) {
        Node temp=head;
        while(temp!=null){
            Node t=temp.next;
            if(temp.child!=null){
                Node c=flatten(temp.child);
                temp.next=c;
                c.prev=temp;
                while(c.next!=null) c=c.next;
                if(t!=null){
                    c.next=t;
                    t.prev=c;
                }
            }
            temp.child=null;
            temp=t;
        }
        return head;
    }
}
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head ;
        while(temp!=null){
            Node t= temp.next ;
            if(temp.child != null){
               Node c= flatten(temp.child);
               temp.next = c; 
               c.prev= temp;

               //c ko aage le jao
               while(c.next!= null){
                c=c.next ;
               }
               c.next = t ;
              if(t!= null ) t.prev = c ;
            }
            temp.child = null;
            temp=t ;// bcz t already temp.next hi tha 
        }
        return head ;
    }
}; 
