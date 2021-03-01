import java.util.HashMap;
public class Hashmap1{
    public static void main(String[] args) {
       HashMap<String,Integer> m  = new HashMap<String ,  Integer>();
       m.put("gfg", 10);
       m.put("ide", 15);
       m.put("courses", 20);
       System.out.println(m.size());
       System.out.println(m);
       if(m.containsKey("gfg"))
            System.out.println("yes");
        else   
            System.out.println("no");  
        m.remove("gfg"); 
        System.out.println(m.size());
        System.out.println(m.get("gfg"));
         // all the function covered     

    }
}