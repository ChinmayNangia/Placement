import java.util.HashSet;

public class Intersection {
    public static int Efficient(int a[], int b[],int m, int n)
    {
        HashSet<Integer> hset = new HashSet<>();
        int res =0;
        for(int i = 0 ;i<m;i++)
            hset.add(a[i]);
       for(int i = 0 ;i<n;i++)
        if(hset.contains(b[i])==true)
            {
                res++;
                hset.remove(b[i]);
            }
return res;
                    
    }
    public static void main(String[] args) {
        int a[] = new int[]{15, 17, 27, 27, 28, 15};
        int b[] = new int[]{16, 17, 28, 17, 31, 17};
        int m = a.length;
        int n = b.length;
        System.out.println(Efficient(a, b, m, n));
    }
}
