import java.util.HashMap;

public class LongestSum {
    public static int LongSum(int arr[] , int sum ){
        HashMap<Integer,Integer> hMap = new HashMap<>();
        int pre = 0 ;
        int n = arr.length;
        int maxLen = 0 ;
        for(int i = 0 ;i<n;i++){
            pre+=arr[i];

            if(pre == sum)
                maxLen = i+1;

            if(!hMap.containsKey(pre))
                hMap.put(pre, i);
                
            if(hMap.containsKey(pre-sum))
                {
                    if(maxLen<i-hMap.get(pre-sum))
                        maxLen = i-hMap.get(pre-sum);    
                }    
                 
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9}; 
             int sum = 15;
             System.out.println(LongSum(arr, sum));
    }
}
