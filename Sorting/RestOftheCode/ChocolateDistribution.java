import java.util.Arrays;

public class ChocolateDistribution {
    public static int Distribution(int arr[] , int n , int m){
        Arrays.sort(arr);
        int res = arr[m-1] - arr[0];
        for(int i = 1 ;m+i-1<n;i++)
            res = Math.min(res, (arr[m+i-1]-arr[i]));
            return res;

    }
    public static void main(String[] args) {
        int arr[] = new int[]{7,3,2,4,9,12,56};
        
        int n = arr.length;int m=3;
        
        System.out.print(Distribution(arr,n,m));
    }
}
