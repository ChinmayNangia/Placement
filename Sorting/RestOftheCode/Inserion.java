public class Inserion {
    public static void  Insertion(int arr[]){
        int n = arr.length;
        for(int i = 1 ;i<n;i++){
            int key = arr[i];
            int j = i-1 ;
            while(j>=0 && arr[j]>key ){
                arr[j+1]  =arr[j];
                j--;
            }
            arr[j+1]  =key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,10,8,7};
        Insertion(arr);
        for(int x:arr)
         System.out.println(x);
    }
}
