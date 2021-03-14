class Node5
{
    int data;
    Node5 next;
    Node5(int x){
        data=x;
        next=null;
    }
}
public class PairWiseSwap{
    static void pairwiseSwap(Node5 head){
        Node5 curr=head;
        while(curr!=null&&curr.next!=null){
            int temp = curr.data; 
            curr.data = curr.next.data; 
            curr.next.data = temp;
            curr=curr.next.next;
        }
    }
     
    public static void printlist(Node5 head){
        Node5 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
}
static Node5 pairwiseSwap_1(Node5 head){
    if(head==null||head.next==null)
        return head;
    Node5 curr=head.next.next;
    Node5 prev=head;
    head=head.next;
    head.next=prev;
    while(curr!=null&&curr.next!=null){
        prev.next=curr.next;
        prev=curr;
        Node5 next=curr.next.next;
        curr.next.next=curr;
        curr=next;
    }
    prev.next=curr;
    return head;
}
    public static void main(String[] args) {
        
        Node5 head=new Node5(1);
    	head.next=new Node5(2);
    	head.next.next=new Node5(3);
    	head.next.next.next=new Node5(4);
    	head.next.next.next.next=new Node5(5);
    	printlist(head);
    	pairwiseSwap(head);
    	printlist(head);
    }
}