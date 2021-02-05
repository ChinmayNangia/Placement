public class MaxCircularSum {


    public static int kadane(int arr[] , int n ) {
        int res = arr[0] , maxsum = arr[0];
        for(int i = 1 ; i<n; i++){
            maxsum = Math.max(arr[i], maxsum+arr[i]);
            res = Math.max(maxsum, res);
        }
        return res;
    }


    public static int CircularSum(int arr[] , int n){
        int maxSum = kadane(arr, n);
        if(maxSum<0)
            return maxSum;
            int arrsum = 0 ;
        for(int i = 0 ; i < n ;i++){
                arrsum+=arr[i];
                arr[i] = - arr[i];
        }    
        int CircularSum = arrsum+kadane(arr, n);
        return Math.max(CircularSum, kadane(arr, n));
    }
    public static void main(String[] args) {
        int arr[] = {8, -4, 3, -5, 4}, n = 5;

        System.out.println(CircularSum(arr, n));
    }
}
