public class FirstOccurence{
    public static int FirstIterative(int arr[] , int x){
        int n = arr.length;
        int low = 0 ;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(x<arr[mid])
                high = mid-1;
            else if(x>arr[mid])
                low = mid+1;
            else{
                if(arr[mid]==0 || arr[mid] != arr[mid-1])
                    return mid;
                else 
                    high = mid-1;    
            }        
        }
        return -1;

    }
    public static int FirstRecursive(int arr[],int low , int high , int x ){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if(x<arr[mid])
            return FirstRecursive(arr, low, mid-1, x);
        else if(x>arr[mid])
            return FirstRecursive(arr, mid+1, high, x);
        else {
            if(mid== 0 || arr[mid] != arr[mid-1])
                return mid;
            else
                return FirstRecursive(arr, low, mid-1, x) ;   
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 20};

		int x = 10;
        // System.out.println(FirstIterative(arr, x)); 
        System.out.println(FirstRecursive(arr, 0, arr.length-1, x));  
    }
}