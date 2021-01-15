package prime_factor;

class Check{
    public static boolean isPrime(int n) {
        if(n==1)
        return false;
        if(n==2 || n==3)
        return true;
        for(int i =5;i<=Math.sqrt(n);i+=6){
            if(n%i==0|| n%(i+2)==0){
                return false;
            }
        }
        return true;
        
    }

    public static void  primeFactor(int n) {
        for(int i =2;i<n;i++){
            if (Check.isPrime(i)){
                int x = i;
                while(n%i==0){
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
        
    }

}

class Naive_Method{
    public static void main(String[] args) {
    int n =12;
    Check.primeFactor(n);
    
    }

}