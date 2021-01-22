public class Permutation {
    public static String swap(String s , int i,int j){
        char temp;
        char[] charAraray = s.toCharArray();
        temp = charAraray[i];
        charAraray[i] = charAraray[j];
        charAraray[j] = temp;
        return String.valueOf(charAraray); 

    }
    public static void perm(String s , int l,int r){
        if(l==r)
            System.out.println(s);
        else{
            for(int i = l;i<=r;i++){
              s=swap(s, l, i);
                perm(s, l+1, r);
               s=swap(s, l, i);
            }
        }

    }
    public static void main(String[] args) {
     String s = "ABC";
     perm(s, 0, s.length()-1);   
    }
}
