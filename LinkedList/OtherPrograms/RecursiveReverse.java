class Node7{
    int data;
    Node7 next ; 
    Node7(int x){
        data = x ; 
        next = null;
    }
}
public class RecursiveReverse {
    static Node7 reverseK(Node7 head,int k){
        Node7 curr=head,next=null,prev=null;
        int count=0;
        while(curr!=null&&count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null){
            Node7 rest_head=reverseK(next,k);
            head.next=rest_head;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        Node7 head=new Node7(10);
    	head.next=new Node7(20);
    	head.next.next=new Node7(30);
    	head.next.next.next=new Node7(40);
    	head.next.next.next.next=new Node7(50);
    	head.next.next.next.next.next=new Node7(60);
    	head.next.next.next.next.next.next=new Node7(70);
    	// printlist(head);
    	head=reverseK(head,3);
    	// printlist(head);
    	 
    }
}
