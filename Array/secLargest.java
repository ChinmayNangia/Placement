public class secLargest {
    public static int secLarge(int arr[]){
       int res = -1;
       int large = 0 ;
       int n =arr.length;
       for(int i = 0 ;i<n;i++){
            if(arr[i]>arr[large]){
                res = large;
                large = i;
            }
            if(arr[i]!= arr[large]){
                if(res == -1 || arr[i]>arr[res]){
                    res = i;

                }
            }
       }
       return arr[res];
    
    }
    public static void main(String[] args) {
        int arr[] = {10,12,15,19,11,6,22};
        System.out.println(secLarge(arr));
    }
}
