public class Rearrange {
    public static void re(int arr[] ,int n){
        int temp[] = new int[n];
        int right = n-1;
        int left = 0 ;
        int i = 0 ;
        
        while(left<=right){
            temp[i] = arr[right];
            if(left == right)
                break;
            temp[i+1] = arr[left];
            right--;
            left++;
            i+=2;
            
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        re(arr,n);
        for(int i = 0 ;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

// bigO(n) time 
// O(1)