public class FindElement {
    public static int r=4,c=4;
    public static void searchElementInMatrix(int arr[][], int x){
        int i = 0,j=c-1;
        while(i<r && j>=0)
        {
            if(x<arr[i][j])
                j--;
            if(x==arr[i][j]){
                System.out.println("the element found at (  "+i+" "+j+" ) ");  
               return;
            }
            else i++;
           
        }
        System.out.println("element not found ");

    }
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 35, 45},
        {32, 33, 39, 50}};
int x = 29;	   
searchElementInMatrix(arr, x);
    }
}
