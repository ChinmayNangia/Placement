package power;

public class Best {
    public static int pow_1(int x ,int n){
        int res = 1;
        while(n>0){
            if(n%2!=0){
                res = res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        int  n =2;
        int  x =3;
        System.out.println(pow_1(x, n));
    }
}
// 3 to the power of 2
