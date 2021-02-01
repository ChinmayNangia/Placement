public class PrefixSum {
    public static int[] prefix(int arr[]){
        int n = arr.length;
        int PrefixSum[] = new int[n];
        PrefixSum[0] = arr[0];
        for(int  i = 1 ;i<n;i++){
            PrefixSum[i] = arr[i]+PrefixSum[i-1];
        }
        return PrefixSum;
    }
    public static int Sum(int arr[],int l,int r){
        if(l!= 0 )
           return  arr[r] = arr[r]- arr[l-1];
        else
             return arr[r];    
    }
    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 9, 6, 5, 4};

        int prefix_sum[] = prefix(arr);
 
        System.out.println(Sum(prefix_sum, 1, 3));
        
        System.out.println(Sum(prefix_sum, 0, 2));
    }
}
