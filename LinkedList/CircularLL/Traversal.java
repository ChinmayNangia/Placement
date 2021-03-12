class Node1{
    int data ;
    Node1 next;
    Node1(int x){
        data = x;
        next = null;
    }
}
public class Traversal{
public static void cLLTraversal(Node1 head){
    if(head == null) return ;
    System.out.println(head.data);
    for(Node1 r = head.next ; r!=head;r= r.next)
        System.out.print(r.data+" ");
}
    public static void main(String[] args) {
        Node1 head=new Node1(10);
    	head.next=new Node1(5);
    	head.next.next=new Node1(20);
    	head.next.next.next=new Node1(15);
    	head.next.next.next.next=head;
    	cLLTraversal(head);
    }
}