
 public class MaxOccured{ 



    public  static int maxOcc(int L[], int R[], int n)
    {	
	    	int arr[] = new int[1000];

	    	for(int i = 0; i < n; i++)
	    	{
	    		arr[L[i]]++;

	    		arr[R[i] + 1]--;
	    	}

	    	int maxm = arr[0], res = 0;

	    	for(int i = 1; i < 1000; i++)
	    	{
	    		arr[i] += arr[i - 1];

	    		if(maxm < arr[i])
	    		{
	    			maxm = arr[i];

	    			res = i;
	    		}
	    	}

	    	return res;
    }
    public static void main(String args[]) 
    { 
       int L[] = {1, 2, 3}, R[] = {3, 5, 7}, n = 3;

      System.out.println(maxOcc(L, R, n)); 
      
    } 

}