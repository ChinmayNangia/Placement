public class Kadane {
    public static int Naive(int arr[]){
        int n =arr.length;
        int res = arr[0];
            for(int i = 0 ;i<n;i++){
                int count = 0;
                for(int j = i+1;j<n;j++){
                    count+=arr[j];
                    res = Math.max(res, count);
                }
            }
            return res;
    }
    public static int Efficient(int arr[]){
        int n = arr.length;
        int res = arr[0],maxElement = arr[0];
        for(int i =1 ;i<n;i++){
            maxElement = Math.max(maxElement+arr[i],arr[i]);
            res = Math.max(maxElement, res);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -1, 2};

        System.out.println(Naive(arr));
    }
}
