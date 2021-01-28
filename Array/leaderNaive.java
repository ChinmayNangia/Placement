public class leaderNaive{
    public static void leader(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){

            boolean flag = false;
            for(int j = i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag ==false)
            System.out.println(arr[i]);

        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 10, 6, 5, 2};

       leader(arr);
    }
}

// time complexity theta(n2)