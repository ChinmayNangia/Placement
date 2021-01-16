public class substring {
    public  static void curre(String s , String curr, int index){
        if(index == s.length()){
            System.out.println(curr+"");
            return;
        }
        curre(s,curr,index+1);
        curre(s,curr+s.charAt(index),index+1);

    }
    public static void main(String[] args) {
        String s = "ABC";
        curre(s, "", 0);
    }
}
