class Node5{
    int data ;
    Node5 next;
    Node5(int x){
        data = x; 
        next = null;
    }
}
public class Deletehead {
    public static Node5 delete(Node5 head ){
        if(head == null || head.next == null) return null;
        Node5 curr = head;
        while(curr!= head)
            curr = curr.next;
        curr.next = head.next;
        return curr.next;
    }
    public static Node5 deleteEfficient(Node5 head){
        if(head == null||head.next == null) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    public static void main(String[] args) {
        
    }
}
