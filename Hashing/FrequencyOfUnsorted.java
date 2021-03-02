import java.util.HashMap;
import java.util.Map;

public class FrequencyOfUnsorted {
    public static void NaiveIterative(int arr[], int n) {
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }

    }

    static void countFreq(int arr[], int n)
    {
       Map<Integer,Integer> hMap = new HashMap<>();
       for(int i = 0 ;i<n;i++){
           if(hMap.containsKey(arr[i])==true)
                hMap.put(arr[i], hMap.get(arr[i])+1);
            else hMap.put(arr[i],1);    
       }
       for(Map.Entry<Integer,Integer> itr : hMap.entrySet())
            System.out.println(itr.getKey()+"  "+ itr.getValue());

    }

    public static void main(String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15}; 
        int n = arr.length;
        // NaiveIterative(arr, n);
        countFreq(arr, n);
    }
}