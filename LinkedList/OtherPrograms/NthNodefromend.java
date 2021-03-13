class Node3{
    int data ; 
    Node3 next ; 
    Node3(int x){
        data = x ;
        next = null;
    }
}
public class NthNodefromend {
    public static void Naive(Node3 head , int n){
        int len = 0 ;
        for(Node3 curr = head ; curr!= head;curr=curr.next)
                len++;
                Node3 curent = head;
          if(n>len)return;      
        for(int i = 0 ;i<(len-n+1);i++)
            curent = curent.next;
        System.out.println(curent.data);    
    }    
    public static void Efficient(Node3 head , int n){
        if(head == null) return;
        Node3 first = head;
        for(int i = 0 ;i<n;i++){
            if(first==null)return;
            first = first.next;
        }
        Node3 second  = head;
        while (first !=null){
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);

    }
    public static void main(String[] args) {
        Node3 head=new Node3(10);
    	head.next=new Node3(20);
    	head.next.next=new Node3(30);
    	head.next.next.next=new Node3(40);
    	head.next.next.next.next=new Node3(50);
    	printlist(head);
    	System.out.print("Nth node from end of Linked List: ");
    	Naive(head,2);
    }
    private static void printlist(Node3 head) {
        Node3 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}
