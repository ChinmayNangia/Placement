public class StockBuy {
    public static int Stock(int arr[]){
        int profit = 0 ;
        int n = arr.length;
        for(int i = 1 ;i<n;i++){
            if(arr[i]>arr[i-1])
                profit+=(arr[i]-arr[i-1]);
        }
        return profit;
    }
      public  static int maxProfit(int price[], int start, int end)
    {
    	if(end <= start)
    		return 0;

    	int profit = 0;

    	for(int i = start; i < end; i++)
    	{
    		for(int j = i + 1; j <= end; j++)
    		{
    			if(price[j] > price[i])
    			{
    				int curr_profit = price[j] - price[i] 
    								  + maxProfit(price, start, i - 1)
    								  + maxProfit(price, j + 1, end);

    				profit = Math.max(profit, curr_profit);
    			}
    		}
    	}

    	return profit;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 8, 12};

        System.out.println(Stock(arr));
        System.out.println(maxProfit(arr, 0, arr.length-1));
    }
}
