public class delete {
    public static int d(int arr[],int n,int x){
        int i = 0 ;
        for(i=0;i<n;i++){
            if(arr[i]==x)
            break;
        }
        if(n==x)
        return n ;//no element is present
        for(int j = i ;j<n-1;j++){
            arr[j] = arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 12, 5, 6}, x = 12, n = 5;

        System.out.println("Before Deletion");
 
        for(int i=0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
 
        System.out.println();
        
 
        n = d(arr, n, x);
 
        System.out.println("After Deletion");
 
        for(int i=0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
    }
}
