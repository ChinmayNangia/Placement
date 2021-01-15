package prime_factor;

class Factor{
    public static void fac(int n) {
        while(n<1)
        return;
        while(n%2==0)
        {
        System.out.println(2);
        n=n/2;
         }
        while(n%3==0)
        {
        System.out.println(3);
        n=n/3;
        }
        for(int i = 5;i*i<=n;i+=6){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n/=(i+2);
            }
        }
        if(n>3){
            System.out.println(3);
        }
        

        
    
}
    public static void main(String[] args) {
     int n =12;
     Factor.fac(n);   
    }
}