public class josephus{
    public static int jos(int n,int k){
        if(n==1)
        return 0;
        else
        return (jos(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
        int n = 7 ;
        int k =3;
        System.out.println("normal solution");
        System.out.println(jos(n, k));
        System.out.println("extended problem where  it starts from 1");
        System.out.println(jos(n, k)+1);

        // the other way  is to ((jos(n-1,k)+k-1)%n+1);
    }
}
