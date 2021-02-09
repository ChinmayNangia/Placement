public class LastOccurence {
    public static int LastOccurenceIterative(int arr[] , int x){
        int n = arr.length;
        int low = 0 ;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2 ;
            if(x<arr[mid])
                high = mid -1;
            else if(x>arr[mid])
                low = mid+1;
            else{
                if(mid ==n-1|| arr[mid] != arr[mid+1] )
                    return mid;
                else 
                    low = mid+1;    
            }        
        }
        return -1;
    }
    public static int LastOccurenceRecursive(int arr[] , int low , int high , int x){
        
        if(low>high) return -1;

        int mid = (low+high)/2;
        if(x<arr[mid])
            return LastOccurenceRecursive(arr, low, mid-1, x);
        else if(x>arr[mid])
            return LastOccurenceRecursive(arr, mid+1, high, x);
        else {
            if(mid == arr.length-1 || arr[mid] !=arr[mid+1] )
                return mid;
            else  return LastOccurenceRecursive(arr, mid+1, high, x);

        }        

    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 15, 20, 20, 20};

		int x = 20;
        System.out.println(LastOccurenceIterative(arr, x));
        System.out.println(LastOccurenceRecursive(arr, 0, arr.length-1, x));
    }
}
