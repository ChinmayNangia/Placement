
class Node6{
    int data;
    Node6 next;
    Node6(int x){
        data = x;
        next = null;
    }
}
public class Search{
    public static void main(String[] args) {
        Node6 head=new Node6(10);
    	head.next=new Node6(20);
    	head.next.next=new Node6(30);
    	printlist(head);    
    	System.out.println("Position of element in Linked List: "+search(head,20));


    }
    public static void printlist(Node6 head) {
        Node6 cur = head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
            System.out.println();
        }
    }
    public static int search(Node6 head , int x){
        int pos = 1;
        Node6 curr = head;
        while(curr!=null){
            if(curr.data==x)
                return pos;
            else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    
    }
}
