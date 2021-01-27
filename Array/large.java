public class large {
    public static int largest(int arr[]){
        int res = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>res)
            res = i;

        }
        return arr[res];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(largest(arr));

    }
}


