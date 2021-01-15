package power;

class WorstCase{
    public static int pow(int x,int n){
        int res = 1;
        for(int i =1 ; i<=n;i++){
            res = res*x;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        int x =3;
    System.out.println(pow(x, n));
    }
}