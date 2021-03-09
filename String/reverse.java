public class reverse {
    public static void reverse_1(char[] str,int n){
        int start = 0 ;
        for(int end = 0;end<n;end++){
            if(str[end]==' '){
                swap(str,start,end-1);
                start=end+1;
            }

        }
        swap(str, start, n-1);
        swap(str, 0, n-1);
    }
    public static void swap(char[] str, int low, int high) {
        while(low<=high){
        char temp=str[low];
        str[low] = str[high];
        str[high] = temp;
        high--;
        low++;
        }
    }
    public static void main(String[] args) {
        String s =  "Welcome to Gfg";
       int n = s.length();
       char[] str = s.toCharArray();
       System.out.println("After reverse");
       reverse_1(str, n);
       System.out.println(str);
    }
}
