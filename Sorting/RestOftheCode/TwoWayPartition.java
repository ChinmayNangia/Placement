public class TwoWayPartition {
    public static void two(int arr[], int n){
        int j  = n ;int i = -1;
        while(true){
            do{i++;}while(arr[i]==0);
            do{j--;}while(arr[j]>0);
            if(i>=j)return ;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,0,1,1,0};
        
        int n = arr.length;
        
        two(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");

    }
}
