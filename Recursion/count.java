public class count {
    public static void count_1(int n){
        if(n==0)
        return ;
        System.out.println(n);
        count_1(n-1);

    }
    public static void main(String[] args) {
        int n =  5;
        count_1(n);
    }
}
