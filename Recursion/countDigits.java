class countDigits{
    public static int count(int n){
        if(n<10)
        return 1;
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        int n  =34567;
        System.out.println(count(n));
    }
}