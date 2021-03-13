class Node5{
    int data;
    Node5 next;
    Node5(int x){
        data = x ; 
        next = null;
    }
}
public class ReveseLLRecursive {
    static Node5 rev1(Node5 head){
        if(head == null|| head.next==null)return null;
        Node5 rest_head = rev1(head.next);
        Node5 rest_tail = head.next;
        rest_tail.next = head;
        return rest_head;
    }
     
    public static void main(String[] args) {
        Node5 head=new Node5(10);
    	head.next=new Node5(20);
    	head.next.next=new Node5(30);
    	// printlist(head);
    	head=rev1(head);
    	// printlist(head);
    }
}
