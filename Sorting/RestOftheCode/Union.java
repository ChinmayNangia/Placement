import java.util.Arrays;

public class Union {
    public static void uni(int a[] , int b[], int m, int n ){
        int c[] = new int[m+n];
       for(int i = 0 ;i<m;i++)
            c[i] = a[i];
        for(int j = 0 ;j<n;j++)
            c[j+m] = b[j];  
        Arrays.sort(c);
        for(int i = 0 ;i<m+n;i++){
            if(i==0 || c[i-1] != c[i])
                System.out.println(c[i]+" ");
        }      
    }
    public static void Efficient(int a[] , int b[] , int m , int n){
        int i = 0 , j= 0 ; 
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){i++;continue;}

            if(j>0 && b[j-1]==b[j]){j++;continue;}
            
            if(a[i]<b[j]){System.out.print(a[i]+" ");i++;}
            
            else if(a[i]>b[j]){System.out.print(b[j]+" ");j++;}
            
            else{System.out.print(a[i]+" ");i++;j++;}
        }
        while(i<m){if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" ");i++;}
        while(j<n){if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" ");j++;}
    }
    public static void main(String[] args) {
        int a[] = new int[]{3,8,10};
        int b[] = new int[]{2,8,9,10,15};
        
        int m = a.length;
        int n = b.length;
	    // uni(a,b,m,n);
        Efficient(a, b, m, n);
    }
}
