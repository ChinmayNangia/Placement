public class brian_ker {
    public static int count_bit(int n){
        int res = 0;
        while(n>0){
            n=(n & (n-1));
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int  n =4;
        System.out.println(count_bit(n));
    }
}