public class SmallestMissing {
    public static int missing(int nums[] ,int n){
        boolean contains_one = false;
        for(int x : nums){
            if(x == 1 ){
                contains_one = true;
                break;
            }
        }
            if(!contains_one) return 1;
            if(n==1) return 2;

            for(int i = 0 ;i < n; ++i)
                if(nums[i]<= 0 || nums[i]>n) nums[i] = 1 ;

            for(int i = 0 ; i < n;++i){
                int x = Math.abs(nums[i]);
                if(nums[x-1]>0) nums[x-1]*=-1;
            }    
            // manipulating the index
            for(int i = 0 ;i<n;++i){
                if(nums[i]>0) return i+1;
            }
            return n+1;

        }


    
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        int n = arr.length;
        System.out.println(missing(arr, n));   
    }
}

// this code takes bigO (n) time complexity
// and O(n) aux space