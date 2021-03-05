
import java.util.LinkedHashMap;
import java.util.Map;


class pair 
{
    String first;
    int second;
    pair(String first , int second)
        {
            this.first = first;
            this.second = second;
        }
}
public class winner {
    public static String[] winner1(String arr[], int n) {
        // add your code
        LinkedHashMap<String, Integer> hMap = new LinkedHashMap<>();
       
        
        for (String x : arr)
            hMap.put(x, hMap.getOrDefault(x, 0) + 1);
            System.out.println(hMap);
            int maxValue = 0;
            String maxkey = "";
            
        for(Map.Entry<String,Integer> itr : hMap.entrySet()){
           String  key = itr.getKey();
           int  value = itr.getValue();


           if(value>maxValue){
            maxValue = value;
            maxkey= key;
           }
         else if (maxValue==value && maxkey.compareTo(key)>0)
           maxkey = key;
           maxValue=value;
           


        }
        String res[] = {maxkey,maxValue+""};
        return res;
        
    }
    public static void main(String[] args) {
        String arr[] ={"john","johnny","jackie","johnny","john" ,
            "jackie","jamie","jamie","john","johnny","jamie",
            "johnny","john","john"};
        // String arr[] =  {"andy","blake","clark"};
            int n =arr.length;
            System.out.println(winner1(arr, n));
    }
}
