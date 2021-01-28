public class moveDNaive {
    public static void move(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        System.out.println(temp);
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void move(int arr[] ,int d){
        // int n = arr.length;
        for(int i = 0;i<d;i++){
            move(arr);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       move(arr, d);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    }
}
