public class Peak {
    public static int Naive(int arr[] , int n){
    if(n==1)return arr[0];

    else if(arr[0]>arr[1])  return arr[0];
        
    else if(arr[n-1]>arr[n-2]) return arr[n-1];
    for(int i = 1 ;i<n-1;i++)
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return arr[i];
    return -1;    
    }
/// write the efficient approach
    public static int Efficient(int arr[] , int n){
    int low = 0 , high = n-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(mid == 0 || arr[mid -1]<=arr[mid] && mid==n-1 || arr[mid+1]<=arr[mid])
            return arr[mid];
        else if(mid>0 && arr[mid]<=arr[mid-1])
            high = mid-1;
        else
            low = mid+1;    
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[] = {1, 7, 8, 20, 12}, n = 5;

        System.out.println(Naive(arr, n));
        System.out.println(Efficient(arr, n));
    }
}
