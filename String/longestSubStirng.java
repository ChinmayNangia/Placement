import java.util.Arrays;

public class longestSubStirng {
    // this is a naive solution
    public static int longDistinct(String str){
       int n = str.length();
       int res = 0 ;
       for(int i = 0 ;i<n;i++){
           boolean visited[] = new boolean[256];
           for(int j = i ;j<n;j++){
               if(visited[str.charAt(j)]==true)
                break;
                else{
                    res = Math.max(res, j-i+1);
                    visited[str.charAt(j)]=true;
                }
           }
       }return res;
    }
    public static int longDistinctEfficient(String str){
        int n = str.length();
        int res = 0 ;
        int prev[] = new int[256];
        Arrays.fill(prev, -1);
        int i = 0 ;
        for(int j = 0 ;j<n;j++){
            i=Math.max(i, prev[str.charAt(j)]+1);
            int max = j-i+1;
            res = Math.max(res, max);
            prev[str.charAt(j)]=j;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks"; 
	    int len = longDistinctEfficient(str);  
        System.out.print("The length of the longest distinct characters substring is "+ len); 
    }
}