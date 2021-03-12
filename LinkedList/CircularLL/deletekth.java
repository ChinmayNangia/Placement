class Node6{
    int data;
    Node6 next;
    Node6(int x){
        data = x;
        next = null;

    }
}
public class deletekth{
    public static Node6 deleteKth(Node6 head , int k ){
        if(head == null) return null;
        if(k==1) deletehead( head);
        Node6 curr= head;
        for(int i = 0;i<k-2;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;

    }
    private static Node6 deletehead(Node6 head) {
        if(head==null)return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
   
    public static void main(String[] args) {
        Node6 head=new Node6(10);
    	head.next=new Node6(20);
    	head.next.next=new Node6(30);
    	head.next.next.next=new Node6(40);
    	head.next.next.next.next=head;
    	head=deleteKth(head,3);
    	printlist(head);
    }
    private static void printlist(Node6 head) {
        if(head==null)return;
        Node6 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
}