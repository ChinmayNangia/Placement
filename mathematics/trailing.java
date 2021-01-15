public class trailing { 
    public static int zero_Count(int n) {
    int res = 0;
    for(int i = 5; i <= n ;i*=5){
        res+=n/i;
    }
    return res;
}

    public static void main(String[] args) {
        int n = 251;
       System.out.println(zero_Count(n));
    }
}
