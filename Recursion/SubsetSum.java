class SubsetSum{
    public static  int SubSum(int arr[],int n,int sum){
        if(n==0)
        return sum==0?1:0;
        return SubSum(arr, n-1, sum)+SubSum(arr, n-1, sum+arr[n-1]);
    }
    public static void main(String[] args){
        int n = 3, arr[]= {10, 20, 15}, sum = 25;

		System.out.println(SubSum(arr, n, sum));

    }
}