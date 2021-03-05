// import java.util.HashMap;
// import java.util.Map;

// public class equal {
//     public static boolean check(long arr[],long brr[],int n)
// {
//     HashMap<Long, Long> hm = new HashMap<Long, Long>();
//     for(int i = 0 ;i<n;i++){
//         long num = arr[i];
//         if(hm.containsKey(num)){
//             long freq = hm.get(num);
//             freq++;
//             hm.put(num, freq);
//         }
//         else
//         hm.put(num, (long)1);
//     }
//     for(int i = 0 ;i<n;i++){
//         long num = brr[i];
//         if(hm.containsKey(num)){
//             long freq = hm.get(num);
//                 freq--;
//                 hm.put(num, freq);
//         }
//     }
//     boolean flag = false;
//     for(Map.Entry<Long,Long> itr : hm.entrySet()){
//         if(itr.getValue() != 0 ){
//             flag  = true;
//             return false;
//         }
//     }
//     return true;


// }
//     public static void main(String[] args) {
        
//     }
// }
