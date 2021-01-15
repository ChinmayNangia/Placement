package prime_factor;

class Prime_Factor{
    public static void factor(int n){
        for(int i =2 ;i <=Math.sqrt(n);i++){
            while(n%i==0){
            System.out.println(i);
            n=n/i;                
            }
        }
        if (n>1)
        System.out.println(n);
    }
}
public class efficient {
    public static void main(String[] args) {
        int n = 12;
        Prime_Factor.factor(n);

    }
}