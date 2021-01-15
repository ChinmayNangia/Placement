class kthbit{
    static boolean checkKthBit(int n, int k){
        
        if ((n & (1 << (k - 1)))==0 ) 
        return false;
    else
        return true;
    
}

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        System.out.println(checkKthBit(n, k));
    }
}