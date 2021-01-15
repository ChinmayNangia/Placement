public class SumOfNumber {
    public static int sum(int n){
        if(n==0)
        return 0 ;
        int last_digit = n%10;
        n=n/10;
        return sum(n)+last_digit;
    }
    public static void main(String[] args) {
        int n =253;
        System.out.println(sum(n));
    }
}
