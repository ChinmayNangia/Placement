
public class TwoPointer {
    public static boolean Naive(int arr[] , int x){
        // this is valid for unsorted and sorted 
        int n = arr.length;
        for(int i =0 ; i<n;i++){
            for(int j = i+1 ; j<n;j++){
                if(arr[i]+arr[j]==x)
                    return true;
            }
        }
        return false;
    }
    public static boolean Efficient(int arr[] , int x){
        // this is only valid for sorted array
        int left = 0 ; 
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==x)
                return true;
            else if(arr[left]+arr[right]>x)
                right--;
            else 
                left++;        
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4,  6, 10, 8 }; 
        int x = 18;
        System.out.println(Naive(arr, x));
        System.out.println(Efficient(arr, x));
    }
}
