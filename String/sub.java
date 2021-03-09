import java.util.Scanner;

public class sub{
    static boolean isSubSeq(String s1, String s2, int n, int m){
        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j))
            j++;
        }
        
        return j == m;
    }

    public static void main(String[] args) {
       Scanner in  = new Scanner(System.in);
       int n = in.nextInt();
       int m = in.nextInt();

       String s1, s2;
      s1 = in.next();
      s2 = in.next();
      System.out.println(isSubSeq(s1, s2, n, m));
      in.close();

    }
}
