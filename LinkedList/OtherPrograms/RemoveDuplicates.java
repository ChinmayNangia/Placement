class Node6{
    int data; 
    Node6 next ; 
    Node6(int x){
        data = x  ;
        next = null;
    }
}
public class RemoveDuplicates {
    public static void remove(Node6 head){
        Node6 curr = head ;
        while(curr.next!= null|| curr!= null){
            if(curr.next == curr.next.next)
                curr.next = curr.next.next;
            else
                curr = curr.next;    
        }
    }
        public static void main(String[] args) {
        
    }
}
