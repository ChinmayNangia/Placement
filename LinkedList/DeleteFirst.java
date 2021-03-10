class Node4{
    int data;
    Node4 next;
    Node4(int x){
        data = x;
        next = null;
    }
}
public class DeleteFirst {

    
    public static void main(String[] args) {
        Node4 head = new Node4(10);
        head.next = new Node4(20);
        head.next.next = new Node4(30);
        head=delHead(head);
        printlist(head);
    }

    private static void printlist(Node4 head) {
        Node4 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }   System.out.println();
    }

    private static Node4 delHead(Node4 head) {
       if(head ==null)
        return null;
        return head.next;
    }
}
