class Node1{
    int data;
    Node1 next;
    Node1 prev;
    Node1(int x){
        data = x ;
        next = null;
        prev = null;
    }
}
public class InsertBegin{

    public static void main(String[] args) {
        Node1 head=new Node1(10);
    	Node1 temp1=new Node1(20);
    	Node1 temp2=new Node1(30);
    	head.next=temp1;
    	temp1.prev=head;
    	temp1.next=temp2;
    	temp2.prev=temp1;
    	head=insertAtTheBegin(head,5);
    	printlist(head);

    } public static void printlist(Node1 head){
        Node1 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }


    public static Node1 insertAtTheBegin(Node1 head, int x) {
        Node1 temp = new Node1(x);
        temp.next = head;
        if(head != null)
            head.prev = temp;
        return temp;    
    }
}