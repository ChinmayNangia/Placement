public class SortedAndRotated {
    public static int SortedAndRotated_Efficient(int arr[] , int x){
        int n = arr.length;
        int low = 0 , high = n-1;
        while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid] == x) return mid;
        else if(arr[mid]>arr[low]){
            if(x>arr[low] && x < arr[low])
                high = mid - 1;
                else 
                low = mid+1;   
        }
        else
            {
                if(x>arr[mid] && x<arr[high])
                    low = mid+1;
                else high = mid - 1;    
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 60, 5, 8};

		int x = 5;
System.out.println(SortedAndRotated_Efficient(arr, x));
    }
}
