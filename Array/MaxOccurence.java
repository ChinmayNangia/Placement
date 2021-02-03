public class MaxOccurence {
    public static int strong(int L[],int R[],int n){
        int arr[] = new int[1000];
        for(int i = 0 ;i <n;i++)
        {
            arr[L[i]]++;
            arr[R[i]+i]--;
        }
        int maxm = arr[0] , res = 0 ;
        for(int i = 0 ;i<n;i++){
            arr[i]+= arr[i-1];
            if(arr[i]> maxm){
                maxm = arr[i];
                res = i ;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
