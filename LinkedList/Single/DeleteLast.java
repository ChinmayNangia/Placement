class Node5
{
    int data;
    Node5 next;
    Node5(int x){
        data = x; 
        next = null;
    }
}
public class DeleteLast {
    public static void main(String[] args) {
        Node5 head = new Node5(10);
        head.next=new Node5(20);
    	head.next.next=new Node5(30);
        printlist(head);
    	head=delTail(head);
	    printlist(head);
    }

    private static void printlist(Node5 head) {
        Node5 cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
            System.out.println();
        }

    }

    private static Node5 delTail(Node5 head) {
       if(head == null  ) return null;
       if(head.next==null) return null;
       Node5 current = head;
       while(current.next.next != null)
           current = current.next;
           current.next = null;
           return head;
       
    }
}
