package gcd;

public class nonOptimize {
    public static int gcd(int a,int b){
        while(a!=b){
            if(a>b)
            a= a-b;
            else
            b=b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        int a=12;
        int b =13;
        gcd(a, b);
    }
}
