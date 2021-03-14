class Node9{
    int data ;
    Node9 next;
    Node9(int x ){
        data  = x ; 
        next = null;
    }
}
public class DetectAndRemove {
    public static void detectRemoveLoop(Node9 head){
        Node9 slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast )
                break;
        }
        if(slow != fast)
            return;
        slow = head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;   
       
    }
    public static void main(String[] args) {
        Node9 head=new Node9(15);
    	head.next=new Node9(10);
    	head.next.next=new Node9(12);
    	head.next.next.next=new Node9(20);
    	head.next.next.next.next=head.next;
    	detectRemoveLoop(head);
    }
}
