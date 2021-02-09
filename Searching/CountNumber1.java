public class CountNumber1 {
  public static int count_1(int arr[] , int n){
      int low = 0;
      int high = n-1;
      while(low<=high){
          int mid = (low+high)/2;
          if(arr[mid]==0)
            low = mid+1;
          else {
              if(arr[mid] == 0 || arr[mid-1]==0 )
                return n -mid;
              else  return mid - 1;  
          }  
      }
      return 0;
  }
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 1}, n = 6;
        System.out.println(count_1(arr, n));
    }
}
