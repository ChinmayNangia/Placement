public class CountElement {
    public static int LastOccurenceIterative(int arr[] , int x ){
        int n  =arr.length;
        int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == n - 1 || arr[mid + 1] != arr[mid])
					return mid;

				else
					low = mid + 1;
			}

		}

		return -1;

    }
    public static int FirstOccurence(int arr[] , int x){
        // Binary Search
        int n = arr.length;
        int low = 0 ; 
        int high = n - 1;
        while(low<= high){
            int mid = (low+high)/2;

            if(x<arr[mid])
                high = mid-1;
            else if(x>arr[mid])
                low = mid+1;   
            else
            {
                    if(arr[mid]==0 || arr[mid-1] != arr[mid])
                        return mid;
                    else 
                    high = mid -1;    
            }

            }     
            return -1;
        }

    public static int  count(int arr[] , int x) {
        int FirstOccurence = FirstOccurence(arr, x);
        if(FirstOccurence ==-1)
            return 0;
        else 
            return (LastOccurenceIterative(arr, x) - FirstOccurence+1);    
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 20,40, 40};

		int x = 40;

		System.out.println(count(arr,  x));
    }
}
