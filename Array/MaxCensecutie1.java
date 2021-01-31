public class MaxCensecutie1 {
    public static int  Naive(int arr[]) {
        int res =  0 ;
        int n = arr.length;
        for(int i=  0 ;i<n;i++){
            int count = 0;

            for(int j = i;j<n;j++){
                if(arr[j]==1)
                    count++;
                else break;
            }
            res = Math.max(res, count);
        }
        return res;
        
    }

    public static int Efficient(int arr[]){
        int res = 0 ;
        int count = 0 ;
        int n  =arr.length;
        for(int i = 0 ;i<n;i++){
            if(arr[i]==0)
                count = 0 ;
            else 
            count++;
            res = Math.max(res, count);

        }
        return res;

    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,0,1,1};
        System.out.println(Efficient(arr));
    
    }
}
