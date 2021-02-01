public class MaxDifference {
    public static int differ(int arr[]){
        int n  =arr.length;
        int res = arr[1]- arr[0];
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                res = Math.max(res,arr[j] - arr[i]);
            }
        }
        // time complexity bigO (n2)
        return res;
        

    }
    public static int differ_1(int arr[]){
        int res = arr[1] - arr[0];
        int n = arr.length;
        int minValue = arr[0];
        for(int i = 0 ;i<n;i++){
            
            minValue = Math.min(minValue,arr[i]);
            res = Math.max(res, arr[i]-minValue);
        } // time compl = theta (n)
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        System.out.println(differ(arr));
       
    }
}
