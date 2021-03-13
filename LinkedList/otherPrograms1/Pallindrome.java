import java.util.ArrayDeque;
import java.util.Deque;

class Node1{
    char data ;
    Node1 next ;
     Node1(char c){
        data = c ;
        next = null;

     }
}
public class Pallindrome {
    public static boolean isPallindrome(Node1 head){
        Deque<Character> stack = new ArrayDeque<>();
        for(Node1 curr = head ;curr != head;curr = curr.next)
            stack.push(curr.data);
        for(Node1 curr = head ;curr != head;curr = curr.next){
            if(stack.pop()!= curr.data)
                return false;
        }
        return true;
    
            
        }
    public static boolean isPallindromeEfficient(Node1 head){
        Node1 slow = head ;
        Node1 fast  = head ;
        while(fast != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node1 revLL = reverseList(slow.next);
        Node1 cur = head ;
        while(revLL != null){
            if(revLL.data != cur.data)
                return false;
            revLL = revLL.next;
            cur = cur.next; 
        }
        return true;

    }    
    static Node1 reverseList(Node1 head){
        if(head==null||head.next==null)return head;
        Node1 rest_head=reverseList(head.next);
        Node1 rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    public static void main(String[] args) {
        
    }
}
