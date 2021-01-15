public class count {
    public static int count_1(int n){
        int  res = 0 ;
        while (n!=0){
            n=n/10;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(count_1(n));
    }
}
