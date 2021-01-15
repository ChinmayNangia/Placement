package lcm;

class optimal{
    public static int gcd(int a,int b){
        if(b==0)
        return a;
        else
        return gcd(b, a%b);
    }
    public static int lcm(int a ,int b){
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
        int a  =4;
        int b = 6;
     System.out.println(lcm(a, b));   
    }
}// a*b = gcd(a,b) * lcm(a,b)