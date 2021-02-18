import java.util.Comparator;

import java.util.*;
class point{
    int x , y;
    point(int x , int y){
        this.x = x ;
        this.y = y;
    }
}
class MyCmp implements Comparator<point>{

    public int compare(point o1, point o2) {
        return o1.x-o2.y;
    }

}
public class Example3{
    public static void main(String[] args) {
        List<Point> list = new ArrayList<Point>(); 
        list.add(new Point(5, 10)); 
        list.add(new Point(2, 20));  
        list.add(new Point(10, 30)); 
        
        // List is sorted in natural order
        // Passing the list and MyCmp object
        
        Collections.sort(list);
        
        // Displaying the points
        for (Point p: list)
            System.out.println(p.x + " " + p.y);
    }
}

