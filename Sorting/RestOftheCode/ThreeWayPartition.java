public class ThreeWayPartition {
    public static void three(int arr[], int n)
    {
        int low = 0 , mid = 0 , high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++; low++;
               
            }
            else if(arr[mid]==1){
                mid++;
                
            }
            else
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;  
                high--; 
                
            }    
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0,1,1,2,0,1,1,2};
        
        int n = arr.length;
        
        three(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
    }
}
