public class search{
    public static int s(int arr[],int x){
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]==x)
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int x = 5;
        System.out.println(s(arr, x));
    }
}