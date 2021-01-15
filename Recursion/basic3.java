public class basic3 {
    public static long fun1(long n){
    if(n==0)
        return 1 ;
    else 
        return n * fun1(n-1);
   

       
    }
    public static void main(String[] args) {
        System.out.println(fun1(13));
    }
}
