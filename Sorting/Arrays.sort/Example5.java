import java.util.*;
public class Example5 {
    public static void main(String[] args) {
        Integer[] arr = {5, 20, 10, 12}; 

       
        Arrays.sort(arr, Collections.reverseOrder()); 

        System.out.println(Arrays.toString(arr)); 
    }
}
