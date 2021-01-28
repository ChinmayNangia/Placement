public class SecondLargest {
    public static int sec(int arr[]){
        int res = -1,n = arr.length,largest = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }
            if(arr[i]<arr[largest]){
                if(res ==-1|| arr[i]>res){
                    res = i;
                }
            }


        }
        return arr[res];
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(sec(arr));
    }
}
