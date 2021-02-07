public class MissingLimtedRange {
    public static void  range(int arr[]){
        int  n = arr.length;
        for(int i = 0 ; i < n ;i++)
            arr[i] = arr[i] -1 ;
        for(int i = 0 ; i < n ;i++)
            arr[arr[i]%n]+=n;
        for(int i = 0 ; i < n ;i++)
            arr[i]/=n;        

    }
    public static void main(String[] args) {
            int arr[] = {3,3,3,3};
            range(arr);
            for(int x : arr)
                System.out.print(x+" ");

    }
}
