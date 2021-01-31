

public class Majority {
    public static int Naive(int arr[]){
        int n  = arr.length;
        for(int i = 0;i<n;i++){
            int count = 1;
            for(int j = i+1; j<n;j++){
                if(arr[i]==arr[j])
                count++;
            }
            if(count>n/2)
                return i;
        }
        return -1;
    }
    public static int Efficient(int arr[]){
        int res = 0;
        int count = 1; 
        int n = arr.length;
        for(int i = 0 ;i<n;i++){
          if(arr[i]==arr[res])
            count++;
          else 
          count --;
          if(count ==0 ){
              count = 1 ;
              res = i;
          }

        }
        count = 0;
        for(int i = 0 ;i<n;i++)
            if(arr[i]==arr[res])
              count++;
        if(count <= n/2)
            return -1;
        return res;    

            

        
    }
    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 8, 6, 6, 6, 6};
        System.out.println(Naive(arr));
    }
}
