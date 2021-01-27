public class sortedBest {
    public static boolean sortCheck(int arr[]){
        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]<arr[i-1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {12,14,11,10};
        int arr1[] = {12,13,14,15};
        System.out.println(sortCheck(arr));
        System.out.println(sortCheck(arr1));

    }
}
