package prime_number;

class Prime_1{
    public static boolean is_Prime(int n) {
        if(n==1)return false;
        else{
            for(int i =2 ;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        
    }
}
public class efficient {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Prime_1.is_Prime(n));
    }
}