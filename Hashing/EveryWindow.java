import java.util.HashMap;

public class EveryWindow {
    public static void distinct(int arr[], int k, int n){
        HashMap<Integer, Integer> m=new HashMap<>(); 
       
       
        for (int i = 0; i < k; i++) { 
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1); 
        } 
       
        System.out.print(m.size()+" "); 
       
        for (int i = k; i < n; i++) { 
            
            m.put(arr[i - k],  m.get(arr[i - k]) - 1);
            
            if (m.get(arr[i - k]) == 0) { 
                m.remove(arr[i-k]); 
            }   
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            
            System.out.print(m.size()+" "); 
        } 
    

    }
   
    public static void main(String[] args) {
        int arr[] = {10,20 ,10,10 ,30,40 };
        // System.out.println(distinct(arr));
        int  k =4;
    distinct(arr, k,arr.length);
       
    }
}
