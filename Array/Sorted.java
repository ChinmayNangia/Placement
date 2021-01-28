public class Sorted {
    public static boolean sort(int arr[]){
        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]>arr[i-1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {5, 12, 30, 2, 35};

       System.out.println(sort(arr));
    }
}
