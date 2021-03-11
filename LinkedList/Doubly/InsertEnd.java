class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int x){
        data = x ;
        next = null;
        prev = null;
    }
}
public class InsertEnd {
    public static Node2 insertAtTheEnd(Node2 head , int x){
        Node2 temp = new Node2(x);
        Node2 curent = head;
        if(head == null)return temp;
        while(curent.next != null)curent = curent.next;
        curent.next = temp;
        temp.prev = curent;
        return head;


    }
    public static void main(String[] args) {
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(20);
        Node2 temp2 = new Node2(30);
        head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=insertAtTheEnd(head,40);
    	printlist(head);
    }
    private static void printlist(Node2 head) {
        Node2 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}
