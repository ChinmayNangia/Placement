public class TrappingRainwater {
    public static int Efficient(int arr[]){
        int n = arr.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        int res = 0;
        lmax[0] = arr[0];
        rmax[n-1] = arr[n-1];
        for(int i =1 ;i<n;i++){lmax[i] = Math.max(lmax[i-1], arr[i]);}
        for(int i=n-2;i>=0;i--){rmax[i] = Math.max(rmax[i+1], arr[i]);}
        for(int i = 1 ;i<n-1;i++){res+=Math.min(lmax[i], rmax[i])-arr[i];}
        return res;        
        }

    public static int Naive(int arr[]){
        int n  = arr.length;
        int res =0 ;
       for(int i = 1 ;i<n-1;i++)
       {
        int lmax = arr[i];
        int rmax = arr[i];

           for(int j = 0 ;j<i;j++)
                lmax = Math.max(arr[j], lmax);
            for(int j = i+1;j<n;j++)
                rmax = Math.max(arr[j], rmax);  
                res += Math.min(rmax, lmax)-arr[i];      
       }
       return res;
       
    }    
    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 2, 5};

        System.out.println( Naive(arr));
    }
}
