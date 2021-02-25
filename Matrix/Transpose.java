public class Transpose {
    public static int n=4;
   public static void  swap(int m[][], int i , int j){
    int temp = m[i][j];
    m[i][j] = m[j][i];
    m[j][i] = temp;
    }

    public static void Efficientprint(int m[][]){
        for(int i = 0 ;i<n;i++){
            for(int j = i+1;j<n;j++){
                swap(m,i,j);
            }
        }
    } 
    public static void NaiveTranspose(int m[][]){
        int temp[][] = new int[n][n];
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ;j<n;j++){
                temp[i][j] = m[j][i];
            }   
        }
        for(int i= 0;i<n;i++){
            for(int j = 0 ;j<n;j++)
                m[i][j] = temp[i][j];
        }
    }   
    public static void main(String[] args) {
        int m[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};

        NaiveTranspose(m);

for(int i = 0; i < n; i++)
{
 for(int j = 0; j < n; j++)
 {
     System.out.print(m[i][j]+" ");
 }

 System.out.println();
}	
    }
}
