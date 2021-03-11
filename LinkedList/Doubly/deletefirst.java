class Node4{
    int data;
    Node4 next;
    Node4 prev ;
    Node4(int x){
        data = x ;
        prev = null;
        next = null;
    }
}
public class deletefirst{
    public static void main(String[] args) {
        Node4 head=new Node4(10);
    	Node4 temp1=new Node4(20);
    	Node4 temp2=new Node4(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=delHead(head);
        head = delHeadLast(head);
    	printlist(head);
    }

    private static void printlist(Node4 head) {
        Node4 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
    private static Node4 delHeadLast(Node4 head) {
        Node4 curr = head;
        if(head == null || head.next==null)return null;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next.prev = null;
        return head;
    }

    private static Node4 delHead(Node4 head) {
        if(head==null) return null;
        if(head.next ==null)return null;
        else{
            head = head.next;
            head.prev = null;
            return head;
        }
     }
}