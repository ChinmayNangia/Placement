class pallindrome{

    public static boolean pall(String str , int start , int end ){
       if(start>=end)
       return true;
       return(str.charAt(start)== str.charAt(end)&&pall(str, start+1, end-1));
    }
       
        public static void main(String[] args) {
           String s = "abbac";
           System.out.println(pall(s, 0, s.length()-1));
          
        }
    }