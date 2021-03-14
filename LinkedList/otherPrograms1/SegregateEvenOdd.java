
class Node7{
        int data;
        Node7 next;
        Node7(int x){
            data=x;
            next=null;
        }
    }
  
class Test { 
    
    public static void main(String args[]) 
    { 
        Node7 head=new Node7(17);
    	head.next=new Node7(15);
    	head.next.next=new Node7(8);
    	head.next.next.next=new Node7(12);
    	head.next.next.next.next=new Node7(10);
    	head.next.next.next.next.next=new Node7(5);
    	head.next.next.next.next.next.next=new Node7(4);
    	printlist(head);
    	head=segregate(head);
    	printlist(head);
    	
    } 
    
    static Node7 segregate(Node7 head){
    Node7 eS=null,eE=null,oS=null,oE=null;
        for(Node7 curr=head;curr!=null;curr=curr.next){
            int x=curr.data;
            if(x%2==0){
                if(eS==null){
                    eS=curr;
                    eE=eS;
                }else{
                    eE.next=curr;
                    eE=eE.next;
                }
            }else{
                if(oS==null){
                    oS=curr;
                    oE=oS;
                }else{
                    oE.next=curr;
                    oE=oE.next;
                }
            }
        }
        if(oS==null||eS==null)
            return head;
        eE.next=oS;
        oE.next=null;
        return eS;
    }
    
    public static void printlist(Node7 head){
        Node7 curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
} 