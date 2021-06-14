// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
       /*
       "abcabd", return 2
        "thedailybyte", return 1
        "developer", return 0
       */
        
        String testCase1  = "abcabd";
        String testCase2  = "thedailybyte";
        String testCase3  = "developer";
        String testCase4  = "abababa";
        
        
        //int end = testCase1.length()-1;
        //int result = end;
        
        HashMap<Character, Integer> countOfChars;
        
        System.out.println(helper(testCase1, new HashMap<>()));
        System.out.println(helper(testCase2, new HashMap<>()));
        System.out.println(helper(testCase3, new HashMap<>()));
        System.out.println(helper(testCase4, new HashMap<>()));
        
       
    }
    
     public static int helper(String testCase, HashMap<Character, Integer> countOfChars)
        {
        int end = testCase.length()-1;
        int result = end;
        while (end >= 0) {
            Character currentChar = testCase.charAt(end);
            if(!countOfChars.containsKey(currentChar)){
                countOfChars.put(currentChar, 1);
                result = end;
            }
               else{
                   countOfChars.put(currentChar, countOfChars.get(currentChar) + 1);
               }
               end--;
        }
        return countOfChars.containsValue(1) ? result : -1;
    }
}
