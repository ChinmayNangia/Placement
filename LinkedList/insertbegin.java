class Node2
{
    int data;
    Node2 next;
    Node2(int x){
        data = x;
        next = null;
    }
}
public class insertbegin {
    static Node2 InsertAtBeginning(Node2 head, int x){
        Node2 temp=new Node2(x);
        temp.next=head;
        return temp;
    }
    
   
    public static void main(String[] args) {
            Node2 head= null;
            head = InsertAtBeginning(head,10);
            head = InsertAtBeginning(head, 20);
            head = InsertAtBeginning(head,30);
           

    }


    



    
}
