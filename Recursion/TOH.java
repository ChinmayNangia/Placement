public class TOH {
    public static void tower(int n , char a ,char b ,char c){
      if(n==1){
          System.out.println("move 1 "+ " from " +a+" to "+" c");
          return;
      }
      tower(n-1, a, c, b);
      System.out.println("move 1 "+" from"+ a+" to "+c);
      tower(n-1, b, a, c);


    }
    public static void main(String[] args) {
        tower(1, 'a', 'b', 'c');
    }
}
