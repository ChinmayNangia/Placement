
class Node4{
    int data;
    Node4 next; 
    Node4(int x){
        data = x ; 
        next = null;
    }
}
public class InsertEnd{
public static Node4 InsertEndNaive(Node4 head , int x){
    Node4 temp = new Node4(x);
    if(head == null){
        temp.next = temp;
        return temp;
    }
    Node4 current = head;
    while(current.next != head){
        current  = current.next;
    }
    current.next = temp;
    temp.next = head;
    return head;  

}
public static Node4 InsertEndEfficient(Node4 head , int x){
    Node4  temp = new Node4(x);

    if(head == null){
        temp.next = temp;
        return temp;
    }
    else{
        temp.next = head.next;
        head.next = temp;
        int t = temp.data;
        temp.data = head.data;
        head.data = t;
        return temp;

    }

}
    public static void main(String[] args){

        Node4 head=new Node4(10);
    	head.next=new Node4(20);
    	head.next.next=new Node4(30);
    	head.next.next.next=head;
    	head=InsertEndNaive(head,15);
    	printlist(head);
    	
    } 
    
    public static void printlist(Node4 head){
        if(head==null)return;
        Node4 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
}
