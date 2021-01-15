package prime_number;

class Prime_2 {
    public static boolean is_Prime(int n) {
        if(n==1)
        return false;
        else if (n==2 || n==3)
        return true;
        else if (n%2==0 || n%3 ==0)
        return false;
        for(int  i = 5 ;i<=Math.sqrt(n);i+=6){
            if(n%i ==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
        
        
    }
}
public class best {
    public static void main(String[] args) {
        int n =989;
        System.out.println(Prime_2.is_Prime(n));
    }
}
