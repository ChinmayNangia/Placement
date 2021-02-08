public class BinarySearch{
    public static int BinarySearchIterative(int arr[] , int x){
        //  time Complexity log(n)
       int n = arr.length;
        int low = 0;
        int high = n-1; 
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] ==x)
                return mid;
            else if(x<arr[mid])
                high = mid-1;
            else
                low = mid+1;    
                    
        }
        return -1; 
    }
    public static int BinarySearchRecursive(int arr[], int x ,int low , int high){
        if(low>high)return -1;
        int mid = (low+high)/2;
        if(arr[mid] == x ) return mid;
        if(x<arr[mid])
            return BinarySearchRecursive(arr, x, low, mid-1);
        else 
        return BinarySearchRecursive(arr, x, mid+1, high);    
            
    }
    public static void main(String[] args) {
        int arr[]  = {10,20 , 30 ,40 ,50};
        int n  = arr.length;
        int k = 20 ;
        System.out.println(BinarySearchIterative(arr, k));
        System.out.println(BinarySearchRecursive(arr, k, 0, n-1));
    }
}