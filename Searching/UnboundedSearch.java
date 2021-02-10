public class UnboundedSearch{
    public static int binarySearch(int arr[] , int low , int high , int x){
        int mid = (low+high)/2;
        if(low>high) return -1;
        else  if(arr[mid] ==x) return mid;
        else if(x>arr[mid])
            return binarySearch(arr, low, mid-1, x);
        else 
            return binarySearch(arr, mid+1, high, x);   

    }
    public static int Naive(int arr[],int x){
        int i = 0 ;
        while(true){
            if(arr[i] == x ) return -1;
            else if(arr[i]>x)return i-1;
            i++;
        }
    }
    public static int Efficient(int arr[] , int x){
        int i = 1 ;
        if(arr[0] == x) return 0 ;
        while(arr[i]<x){
            i*=2;
            if(arr[i]==x) return i;
            
        }
        return binarySearch(arr, i/2+1, i-1, x);
    

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 40, 50};

		int x = 50;
        System.out.println(Efficient(arr, x));
    }
}
