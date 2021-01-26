public class insert {
    public static int i(int arr[],int n, int x ,int cap,int position){
        if(n== cap)
         return n;// the capacity of the array is full
        int index = position-1;
        for(int i = n-1 ;i>=index;i--){
            arr[i+1] = arr[i];
        } 
        arr[index] = x;
        return n+1;
    } 
    public static void main(String[] args) {
        int arr[] = new int[5], cap = 5, n = 3;

        arr[0] = 5; arr[1] = 10; arr[2] = 20;
 
        System.out.println("Before Insertion");
 
        for(int i=0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
 
        System.out.println();
 
        int x = 7, pos = 2;
 
        n = i(arr, n, x, cap, pos);
 
        System.out.println("After Insertion");
 
        for(int i=0; i < n; i++)
        {
                System.out.print(arr[i]+" ");
        }
    }
}


// cap is the capacity 
// position at which the insertion takes place 
// n is the number of the elements 