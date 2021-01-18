class DecToBinary{
    public static void binary(int n){
        if(n==0)
        return ;
        binary(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        int n =6;
        binary(n);
    }
}