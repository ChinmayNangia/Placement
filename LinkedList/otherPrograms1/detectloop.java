import java.util.HashSet;

class Node{
    int data; 
    Node next ; 
     Node(int x){
        data  = x ; 
        next = null;
     }
}
public class detectloop{
    public static boolean ispresent(Node head ){
        Node temp  = new Node(0);
        Node curr = head;
        while(curr != null){
            if(head.next == null)
            return false;
            if(curr.next == temp)
                return true;
            Node curr_next = curr.next;
            curr.next =temp;
            curr = curr_next;
    }
    return false;

    }
    public static boolean detectloopEfficient(Node head){
        HashSet<Node> s = new HashSet<>();
        for(Node curr=head;curr!=null;curr=curr.next) {  
            if (s.contains(curr)) 
                return true; 
            s.add(curr); 
        } 
        return false;  
    }
    public static void main(String[] args) {
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=head.next;
    	if (ispresent(head)) 
            System.out.print("Loop found"); 
        else
            System.out.print("No Loop"); 
    }
}