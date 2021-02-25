public class RotateBy90 {
    public static int n = 4;
    public static void Efficientrotate(int arr[][]){
        EfficientTranspose(arr);
        for(int i = 0 ;i<n;i++){
           int low = 0 ,high =n-1;
           while(low<high){
               swap1(low,high,i,arr);
               high--;
               low++;
           }

        }


    }
    public static void swap1(int low , int high , int i ,int mat[][]){
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;

    }
    public static void  swap(int m[][], int i , int j){
        int temp = m[i][j];
        m[i][j] = m[j][i];
        m[j][i] = temp;
        }
    
        public static void EfficientTranspose(int m[][]){
            for(int i = 0 ;i<n;i++){
                for(int j = i+1;j<n;j++){
                    swap(m,i,j);
                }
            }
        } 
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

    	Efficientrotate(arr);

    		for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					System.out.print(arr[i][j]+" ");
				}

				System.out.println();
			}	
    }
}
