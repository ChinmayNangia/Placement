import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class nkOcuurence {
    public static void NAive(int arr[] , int k ,int n){
        int i=1 , fre =1 ;
        Arrays.sort(arr);
        while(i<n){
            while(i<n&& arr[i]==arr[i-1]){
                fre++;
                i++;
            }
            if(fre>(n/k)){
                System.out.print(arr[i-1]+" ");
                fre=1;
                i++;
            }
        }
    }
    public static void Efficient(int arr[],int k, int n){
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int x : arr)
            hMap.put(x, hMap.getOrDefault(x, 0)+1);
        for(Map.Entry<Integer,Integer> itr : hMap.entrySet()){
            if(itr.getValue()>(n/k))
                System.out.println(itr.getKey());
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10, 10, 20, 30, 20, 10,10};
        
        int n = arr.length;
        int k=2;
        NAive(arr, k, n);
        Efficient(arr, k, n);
    }
}
