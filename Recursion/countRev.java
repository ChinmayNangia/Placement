public class countRev {
    public static void countRev_1(int n){
            if(n==0)
            return;
            countRev_1(n-1);
            System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n = 5;
        countRev_1(n);
    }
}
