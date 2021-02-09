public class Sqrt {
    public static int Naive(int x){
        int i = 1;
        while(i*i<=x)
            i++;
        return i-1;    
    }
    public static int Efficient(int x){
        int low = 0 ;
        int high = x;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int msq = mid*mid;
            if(msq == x)
                return mid;
            else if(x<msq)high = mid-1;
            else {
                low = mid+1;
                ans = mid;
            }    
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(Naive(4));
        System.out.println(Efficient(4));
    }
}
