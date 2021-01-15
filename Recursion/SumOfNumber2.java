public class SumOfNumber2 {
    public static int sum(int n){
        if(n<=9)
        return  n ;
         return sum(n/10)+n%10;
    }
    public static void main(String[] args) {
        int  n =225;
        System.out.println(sum(n));
    }
}
