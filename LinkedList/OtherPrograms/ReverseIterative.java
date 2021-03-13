import java.util.ArrayList;


class Node4{
    int data;
    Node4 next ; 
    Node4(int x){
        data = x ;
        next = null;
    }
}
public class ReverseIterative {
    public static Node4 Naive(Node4 head){
        ArrayList<Integer> aList = new ArrayList<>();
        for(Node4 cur = head ;cur != null;cur = cur.next)
            aList.add(cur.data);
        for(Node4 cur = head ;cur != null;cur = cur.next)
            cur.data = aList.remove(aList.size()-1);
            return head;
    }
    public static Node4 revEffieicnt(Node4 head){
        Node4 curr = head;
        Node4 prev = null;
        while(curr != null){
            Node4 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node4 head=new Node4(10);
    	head.next=new Node4(20);
    	head.next.next=new Node4(30);
    	// printlist(head);
    	head=Naive(head);
    	// printlist(head);
    }
}
