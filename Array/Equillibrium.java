public class Equillibrium {
    public static boolean Naive(int arr[]){
        int n = arr.length;

        for(int i = 0;i<n;i++)
        {
            int leftsum =0 ,rightsum = 0;

            for(int j=0;j<i;j++)
                leftsum +=arr[j];

            for(int k= i+1;k<n;k++)
                rightsum +=arr[k];

            if(leftsum==rightsum)
                return true;    
            
        }
        return false;
    }
    public static boolean isEqui(int arr[]){
        int sum = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            sum+=arr[i];
        }
        int leftsum = 0;
        for(int i =0 ;i<n;i++){
            if(leftsum == sum-arr[i])
                return true;
            leftsum +=arr[i];
            sum-=arr[i];
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 8, -9, 20, 6};

        System.out.println(isEqui(arr));    

    }
}
