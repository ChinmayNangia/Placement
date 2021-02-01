public class WindowSliding {
    public static int Naive(int arr[],int k){
        int maxsum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0;i+k-1<n;i++){
            int sum = 0 ;
            for(int j= 0;j<k;j++){
                sum+=arr[i+j];

            }
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;
    }
    public static int Efficient(int arr[],int k ){
        int sum = 0;
        int n = arr.length;
        int maxsum = sum;
        for(int i = 0;i<k;i++){
            sum+=arr[i];
        }
        for(int i = k ;i<n;i++){
            sum += arr[i]-arr[i-k];
            maxsum=Math.max(sum, maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7}, k=3;

        System.out.println(Efficient(arr,k));
    }
}
