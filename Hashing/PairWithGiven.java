import java.util.HashSet;

public class PairWithGiven {
    public static boolean pair(int arr[] , int sum ,int n){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0 ;i<n;i++){
            if(hashSet.contains(sum-arr[i])==true)
                return true;
                hashSet.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(pair(arr, x, len));
    }
}
