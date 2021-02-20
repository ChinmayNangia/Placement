public class MergeFunction {
    static void merge(int arr[], int l, int m, int h){
        int n1=m-l+1, n2=h-m;

        int[] left=new int[n1];
        int[]right=new int[n2];

        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];

        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];   

        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];    
    }

    public static void  MergeSortAlgorithm(int arr[] ,int l , int r){
        if(r>l){
            int m=l+(r-l)/2;
            MergeSortAlgorithm(arr,l,m);
            MergeSortAlgorithm(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
	    // int l=0,h=8,m=3;
       MergeSortAlgorithm(a, 0, 8);
	    for(int x: a)
	        System.out.print(x+" ");
    }
}
