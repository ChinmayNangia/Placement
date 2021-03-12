class Node3{
    int data;
    Node3 next;
    Node3(int x){
        data = x ; 
        next = null;

    }
}
public class InsertBegin{
    static Node3 insertBegin(Node3 head,int x){
        Node3 temp=new Node3(x);
        if(head==null)
            temp.next=temp;
        
            Node3 curr=head;
            while(curr.next!=head)
                curr=curr.next;
            curr.next=temp;
            temp.next=head;
        
        return temp;
    }
    public static void main(String[] args) {
        Node3 head=new Node3(10);
    	head.next=new Node3(20);
    	head.next.next=new Node3(30);
    	head.next.next.next=head;
    	head=insertBegin(head,15);
    	printlist(head);
    }
    private static void printlist(Node3 head) {
        if(head==null)return;
        Node3 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

}