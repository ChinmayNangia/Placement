class Node3{
    int data;
    Node3 next;
    Node3 prev ;
    Node3(int x){
        data = x ;
        prev = null;
        next = null;
    }
}
public class Reverse {
    public static void main(String[] args) {
        Node3 head = new Node3(10);
        Node3 temp1 = new Node3(20);
        Node3 temp2 = new Node3(30);
        head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
        head = reversing(head );
        printlist(head);
    }
    private static void printlist(Node3 head) {
        Node3 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
   

    private static Node3 reversing(Node3 head) {
        
        if(head == null|| head.next==null)return null;
        Node3 curr = head;
        Node3 prev = null;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }
}
