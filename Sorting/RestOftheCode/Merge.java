import java.util.Arrays;


public class Merge {
    public static void Sort(int a[] , int b[] , int m,int n){
        //  m is the length of the first aray , n is the length of the second array 
        int temp[] = new int[m+n];
        for(int i = 0 ;i<m;i++)
            temp[i] = a[i];
        for(int j = 0 ;j<n;j++)
            temp[m+j] = b[j];
        Arrays.sort(temp);
        for(int x :temp)
            System.out.println(x+" ");    

    }
    public static void MergeSort(int a[] , int b[] , int m , int n){


        int i = 0 ,j= 0 ;
        while(i<m && j<n){
            if(a[i]<b[j])
                System.out.print(a[i++]+" ");
            else
                System.out.print(b[j++]+" ");
        }
        while(i<m){System.out.print(a[i++]+" ");}
        while(j<n)System.out.print(b[j]+" ");
    }

    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};
        
        int m = a.length;
        int n = b.length;
        MergeSort(a,b,m,n);

    }
}
