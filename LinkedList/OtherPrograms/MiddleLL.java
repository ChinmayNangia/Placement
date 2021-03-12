
class Node1{
    int data ;
    Node1 next ;
    Node1(int x){
        data =   x ; 
        next = null;
    }
}
public class MiddleLL{
    public static void Naive(Node1 head){
        if(head ==null) return;
        int count =  0 ;
        Node1 curr;
        for(curr=head;curr!=null;curr=curr.next)
        count++;
        curr = head ;
        for(int i = 0 ;i<count/2;i++)
        curr= curr.next;
        System.out.println(curr.data+" ");
    }

    public static void main(String[] args) {
         Node1 head=new Node1(10);
    	head.next=new Node1(20);
    	head.next.next=new Node1(30);
    	head.next.next.next=new Node1(40);
    	head.next.next.next.next=new Node1(50);
    	printlist(head);
    	System.out.print("Position of element in Linked List: ");
    	Naive(head);
    }
    static void printMiddle(Node head){
        if(head==null)return;
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }
    

    private static void printlist(Node1 head) {
        Node1 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

}