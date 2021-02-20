public class IntersectionOfSortedArray {
    public static void IntersectionNaive(int a[],int b[] , int m , int n ){
        for(int i = 0 ;i<m;i++){
            if(i>0 && a[i-1] == a[i])
                continue;

             for(int j = 0; j<n;j++)
                if(a[i]==b[j]){
                    System.out.println(a[i]+" ");
                        break;
                }
        }
    }
    public static void IntersectionEfficient(int a[], int b[], int m, int n){
        int i=0,j=0 ;
        while(i<m && j<n){
            if(i>0  && a[i-1] == a[i])
              {  i++;continue;}
            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                j++;
            else{
                System.out.println(a[i]+" ");
                    i++;j++;
            }        
        }
    }
    public static void main(String[] args) {
        
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        
        int m = a.length;
        int n = b.length;
	    IntersectionEfficient(a,b,m,n);
        
    }
}
