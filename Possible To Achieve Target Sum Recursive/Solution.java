// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        long[] arr = new long[]{2L,4L,8L, 3L, 2L};
        System.out.println(checkSumPossible(arr, 5L));
    }
    
       public static boolean checkSumPossible(long[] arr, long k) {
           if(arr.length == 0 || arr == null) return false;
           
    
            return checkPossible(arr, k, 0);
           
                
    }
    
        public static boolean checkPossible(long[] arr, long k, int index) {
            if(k == 0) {
                return true;
            }
            if(k < 0 || index == arr.length) return false;
            
                return checkPossible(arr, k - arr[index], index + 1) || checkPossible(arr, k, index + 1);
            
            
        }
}
