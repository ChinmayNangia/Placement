import java.util.HashSet;
import java.util.Set;

public class CountDistinct {
    public static int Distinct(int arr[], int n){
        int frequency = 0 ;
        for(int i = 0 ;i<n;i++){
            
            boolean flag = false;
            for(int j = 0 ;j<i;j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
                if(flag==false)
                   frequency++;
            }
              
            return frequency;
        
    }
    public static int Efficient(int arr[], int n){
        Set<Integer> s = new HashSet<Integer>();
        for(int x : arr){
            s.add(x);
        }
        return s.size();
    }
    public static void main(String[] args) {
        int arr[] = {10,20,10,20,30};
        int n = arr.length;
        System.out.println(Distinct(arr, n));
        System.out.println(Efficient(arr, n));
    }
}
