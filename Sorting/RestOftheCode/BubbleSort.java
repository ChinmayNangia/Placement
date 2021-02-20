public class BubbleSort {
    public static void  sort(int arr[]){
        boolean swap;
        int n = arr.length;
        for(int i = 0 ;i<n-1;i++){
            swap = false;
            for(int  j = 0 ;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap ==false)
                break;
        }
    }
   public static void main(String[] args) {
       int arr[] = {2,10,8,7};
       sort(arr);
       for(int x:arr)
        System.out.println(x);
   } 
}
