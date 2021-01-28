public class reverse {
    public static  void rev(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 7, 30}, n = 4;

       System.out.println("Before Reverse");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       rev(arr);

       System.out.println("After Reverse");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    }
}
