package Divisor;

class best {
    public static void divisor(int n){
        int i = 1;
        for( i = 1 ;i*i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
            
        }        
            for(;i>=1;i--)
            {
                if(n%i==0)
                    System.out.println(n/i);
                
            }
            }
        
    public static void main(String[] args){
int n  = 12;
divisor(n);
    }
}