public class Partition{
    public static void NaivePartition(int arr[], int l , int h, int p ){
        int[] temp=new int[h-l+1];int index=0;
        
        for(int i=l;i<=h;i++)
            if(arr[i]<=arr[p])
                {
                    temp[index]=arr[i];index++;
                }
        for(int i=l;i<=h;i++)
        
            if(arr[i]>arr[p])
                {
                    temp[index]=arr[i];index++;
                }
        for(int i=l;i<=h;i++)
            arr[i]=temp[i-l];
    }
    public static int lomutoPartition(int arr[], int l , int h){
        int p  = arr[h];
        int i = l-1;
        for(int j = l;j<=h-1;j++){
            if(arr[j]<p)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] =arr[h];
        arr[h] = temp;
        return i+1;
    }
    public static int  hoaresPartition(int arr[] , int l , int h) {
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            
            do{
                i++;
            }
            while(arr[i]<pivot);
            do{
                j--;
            }
            while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }   
    }
    public static void lomutoPartitionAlgorithm(int arr[], int l , int h) {
        if(l<h){
            int p = lomutoPartition(arr, l, h);
            lomutoPartitionAlgorithm(arr, l, p-1);
            lomutoPartitionAlgorithm(arr, p+1, h);
        }
        
    }
    public static void hoaresPartitionAlgorithm(int arr[], int l , int h) {
        if(l<h){
            int p = hoaresPartition(arr, l, h);
            hoaresPartitionAlgorithm(arr, l, p);
            hoaresPartitionAlgorithm(arr, p+1, h);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};
        
        int n = arr.length;
        // NaivePartition(arr,0,n-1,n-1);
        // hoaresPartition (arr, 0,n-1);
        // lomutoPartition(arr, 0, n-1);
        // lomutoPartitionAlgorithm(arr, 0, n-1);
        hoaresPartitionAlgorithm(arr, 0, n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
    }
}