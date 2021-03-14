class Node8{
    int data;
    Node8 next ; 
    Node8(int x ){
        data = x ; 
        next = null;
    }
}
public class FloydLoopDetection {
public static boolean isLoop(Node8 head){
    Node8 slow = head , fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast )
            return true;
    }
    return false;
}
    public static void main(String[] args) {
        
    }
}
