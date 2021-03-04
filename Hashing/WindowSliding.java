import java.util.HashMap;

public class WindowSliding {
    public static void Window(int arr[], int k,int n ){
        HashMap<Integer,Integer> hMap = new HashMap<>();
      for(int i = 0 ;i<k;i++) 
        hMap.put(arr[i], hMap.getOrDefault(arr[i], 0)+1);
        System.out.println(hMap.size());
        for(int i = k;i<n;i++){
            hMap.put(arr[i-k], hMap.get(arr[i-k])-1);

            if(hMap.get(arr[i-k])==0)
                hMap.remove(arr[i-k]);     

            hMap.put(arr[i], hMap.getOrDefault(arr[i],0)+1);
            
            System.out.println(hMap.size());
     }


    }
    public static void main(String[] args) {
        int arr[] = new int[]{10, 10, 5, 3, 20, 5};
        
        int n = arr.length;
        int k=4;
        Window(arr, k, n);
    }
}


// create a frequency map of first k items
// print the size
//for(int i = k ;i<n;i++)

// decrease the frequency using get function
// if the frequency is 0 remove it 
//  if the element os not present in the map  insert it 
// print the size of the map again
