import java.util.Arrays;

public class anagram {
    public static boolean areAnagram(String s1 ,String s2){
        if(s1.length()!= s2.length())
            return false;
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);
        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);
        return (s1.equals(s2));

    }
    static final int  CHAR = 256;
    public static boolean areAnagram_1(String s1 , String s2){
        int count[] = new int[CHAR];
        if(s1.length() != s2.length())
            return false;
        for(int i =0;i<s1.length();i++){
            count[s1.length()]++;
            count[s2.length()]--;
        }    
        for(int i = 0;i<s1.length();i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "abaac"; 
        String str2 = "aacba";  
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    }
}
