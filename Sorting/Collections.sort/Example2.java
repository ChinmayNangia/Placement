import java.util.*;
class Point implements Comparable<Point>{
    int x , y;
    Point(int x , int y){
        this.x = x;
        this.y= y;
    }
    public int compareTo(Point P){
        return this.x - P.x;
    }
}
public class Example2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<Point>(); 
        list.add(new Point(5, 10)); 
        list.add(new Point(2, 20));  
        list.add(new Point(10, 30)); 
        Collections.sort(list);
        System.out.println(list);
        for(Point p :list)
            System.out.println(p.x +" "+" "+p.y);
        
    }
}
