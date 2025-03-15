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
