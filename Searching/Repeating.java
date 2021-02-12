public class Repeating {
    public static int Naive(int arr[] , int n){
        boolean visited[] = new boolean[n];
        for(int i = 0 ; i <n;i++){
            if(visited[arr[i]])
                return arr[i];
            visited[arr[i]] = true;    
        }
        return -1;
    }
    public static int Efficient(int arr[] , int n){
        int slow = arr[0] , fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 6, 5, 7, 3}, n= 8;


        System.out.println(Naive(arr, n));
		System.out.println(Efficient(arr, n));
    }
}
