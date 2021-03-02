import java.util.HashSet;

public class SubArraywith {
    public static int sum1(int arr[] , int n , int sum){
        HashSet<Integer> h = new HashSet<Integer>();
        int prefix = 0 ;
        for(int i = 0 ;i<n;i++){
            prefix+=arr[i];
            if(h.contains(prefix)==true)
                    return 1;
                h.add(prefix);    
        }
        return 0 ;
    }
    // prefix -sum
    // same with sum given 
    public static void main(String[] args) {
        
    }
}
