import java.util.HashMap;

public class LongestSubarraywith0and1 {
    public static int subarray(int arr[]){
        HashMap<Integer,Integer> hash = new HashMap<>();
        int preSum = 0 ,maxLen = 0 ;
        for(int i = 0 ;i<arr.length;i++)
            arr[i] = (arr[i]==0)?-1:1;
        for(int i = 0 ;i<arr.length;i++){
            preSum+=arr[i];
            if(preSum==0)
                maxLen = i+1;
            if(hash.containsKey(preSum+arr.length)==true){
                if(maxLen<i-hash.get(preSum+arr.length))
                    maxLen = i-hash.get(preSum+arr.length);
            }else
                hash.put(preSum+arr.length, i);
        }  
        return maxLen;  
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 0, 1, 0, 1, 1, 1};
        System.out.println(subarray(arr));
    }
}
