
class Node2{
    int data ; 
    Node2 next ;
    Node2(int x){
        data = x ; 
        next = null;
    }
}
public class Merge {
    public static Node2 merge1(Node2 a , Node2 b){
        if(a==null) return b;
        if(b==null) return a ;
        Node2 head = null ,tail = null;
        if(a.data<=b.data){
            head = tail = a ;
            a = a.next;
        }
        else{
            head = tail = b; 
            b= b.next;
        }
        while(a!=null && b!= null){
            if(a.data<=b.data){
               tail.next = a;
                tail = a ;
                a = a.next;
            }
            else{
                tail.next = b; 
                tail = b ;
                b = b.next;
            }
        }
        return head;    
    }

    public static void main(String[] args) {
        
    }
}
