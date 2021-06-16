public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 3};
        int[] nums2 = {3, 3};
        
        HashMap<Integer, Integer> firstNumbers = new HashMap<>();
        
        for(int i = 0; i < nums1.length; i++) {
            firstNumbers.put(nums1[i], firstNumbers.getOrDefault(nums1[i], 0) + 1);
        }
        int[] result = new  int[Math.min(nums1.length, nums2.length)];
        int resultCount = 0;
        for(int j = 0; j < nums2.length; j++){
            if(firstNumbers.containsKey(nums2[j])) {
                    firstNumbers.remove(nums2[j]);
                
               
                result[resultCount++] = nums2[j];
            }
        }
      
        for(int k = 0; k < result.length; k++) if(result[k] != 0) System.out.print(result[k]);
    }
}
