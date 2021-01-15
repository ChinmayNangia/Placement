class naive{
    public static void main(String[] args) {
        int n  = 5 ;
        int res = 0;
        while(n!=0){
            if(n%2!=0)
            res++;
            n=n/2;
        }
        System.out.println(res);

    }
}