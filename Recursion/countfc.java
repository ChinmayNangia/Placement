public class countfc {
    public static int countr(int n){
        if(n==1)
        return 1;
        return n+countr(n-1);
    }
    public static void main(String[] args) {
        int  n = 5; 
        System.out.println(countr(n));
    }
}
