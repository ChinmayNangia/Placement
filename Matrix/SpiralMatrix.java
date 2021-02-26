public class SpiralMatrix{
    public static int r= 4 , c= 4 ;
    public static void spiral(int arr[][]){
        int top = 0 ,left = 0 ,down = r-1,right = c-1;
        while(top<=down && left<=right){
            for(int i = left ;i<=right;i++)
                System.out.println(arr[top][i]);
                top++;
            for(int i = top;i<=down;i++)
                System.out.println(arr[i][right]);
                right--;
            if(top<=down){
                for(int i = right;i>=left;i--)
                    System.out.println(arr[down][i]);
                    down--;
            }  
            if(left<=right){
                for(int i = down;i>=top;i--)
                    System.out.println(arr[i][left]);
                    left++;
            }  
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};
                       spiral(arr);
    }
}
