public class FrequencyOfElements{
    public static void Frequency(int arr[]){
        int i =1 ,Frequency = 1;
        int n = arr.length;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                Frequency++;
                i++;    
            }
            System.out.println(arr[i-1]+" "+Frequency);
            i++;
            Frequency = 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 30, 30, 30};
        Frequency(arr);
    }
}