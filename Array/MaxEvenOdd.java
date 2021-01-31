public class MaxEvenOdd {
    public static int Naive(int arr[]){
        int count = 1 ,res = 1 ;
        int n  = arr.length;
        for(int i =0 ;i<n;i++){
            for(int j = i+1;j<n;j++){
                if((arr[j] % 2 ==0 && arr[j-1] % 2 != 0) || arr[j-1] % 2 != 0 && arr[j] % 2 ==0)
                count++;
                else
                break;
            }
            res = Math.max(res, count);

        }
        return res;
    }
    public static int Efficient(int arr[]){
        int count = 1 ,res = 1;
        int n = arr.length;
        for(int i =1 ;i<n;i++){
            if((arr[i] % 2 ==0 && arr[i-1] % 2 != 0) || arr[i] % 2 != 0 && arr[i-1] % 2 ==0)
            {
                count++;
                res = Math.max(res, count);
            }

            else
                count = 1;
        }
        return res;
      
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 6, 3, 8};

        System.out.println(Efficient(arr));
    }
}
