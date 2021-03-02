import java.util.HashSet;

public class Union {
    public static int Efficient(int a[], int b[], int m , int n){
        HashSet<Integer> hSet = new HashSet<>();
        for(int i = 0 ;i <m;i++)
            hSet.add(a[i]);
        for(int i = 0 ;i<n;i++)
            hSet.add(b[i]);
            System.out.println(hSet);
        return hSet.size();        
    }
    public static void main(String[] args) {
        int a[] = new int[]{15, 17, 27, 27, 28, 15};
        int b[] = new int[]{16, 17, 28, 17, 31, 17};
        int m = a.length;
        int n = b.length;
        System.out.println(Efficient(a, b, m, n));
    }
}
