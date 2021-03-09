public class compareTo{
public static void main(String[] args) {
    String s1 = "geekforgeeks";
    String s2 = "him";
    int res = s1.compareTo(s2);
    if(res == 0 )
        System.out.println("same ");
    if(res>0)
        System.out.println("s1 is greater");
    if(res < 0)
        System.out.println("s2 is greater");        
}
}