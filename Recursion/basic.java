class basic{
     public  static void fun1(){
        System.out.println("fun1");
    }

    public static void func2(){
        System.out.println("before fun 1");
        fun1();
        System.out.println("after fun1 ");
    }
    public static void main(String[] args) {
     System.out.println("before fun2");
     func2();
     System.out.println("after fun2");   
    }

}