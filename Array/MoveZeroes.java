public class MoveZeroes {
    public static void zero(int arr[]){
        int count = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count++] = 0;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,0,8,1,0};
        zero(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }   
    }
}