public class AnagramSearch{
    static final int CHAR = 256;
    public static boolean isSame(int CT[],int CP[]){
        for(int i = 0 ;i<CHAR;i++){
            if(CT[i]!= CP[i])
                return false;
        }
        return true;

    }
    public static boolean isPresent(String txt , String pat){
        int CT[] = new int[CHAR];
        int CP[] = new int[CHAR];
        for(int i = 0 ;i<pat.length();i++){
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for(int i = pat.length();i<txt.length();i++){
            if(isSame(CT, CP)) return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
            
        }
        return false;
    }
    public static void main(String[] args) {
        String txt = "geeksforgeeks"; 
        String pat = "frog";  
        if (isPresent(txt, pat)) 
            System.out.println("Anagram search found"); 
        else
            System.out.println("Anagram search not found"); 
    }
}