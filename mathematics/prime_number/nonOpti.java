package prime_number;


class Prime{
    public static boolean prime_Number(int n) {
       if(n==1)
       return false;
       for(int i =2 ;i<n;i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
        
    }
}
class Non_Opti{
    public static void main(String[] args) {
        int a =13;
        System.out.println(Prime.prime_Number(a));
    }
}