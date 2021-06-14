class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 1) return 0;
        return helper(s, new HashMap<>());
    }
    public static int helper(String testCase, HashMap<Character, Integer> countOfChars)
        {
        int end = testCase.length()-1;
        int result = end;
        while (end >= 0) {
            Character currentChar = testCase.charAt(end);
            if(!countOfChars.containsKey(currentChar)){
                countOfChars.put(currentChar, 1);
            }
               else{
                   countOfChars.put(currentChar, countOfChars.get(currentChar) + 1);
               }
               end--;
        }
        int start = 0;
        while(start <= testCase.length()-1) {
            if(countOfChars.get(testCase.charAt(start)) == 1 ) {
                return start;
            }
            start++;
        }
        return -1;
    }
}

/*          GET OR DEFAULT

class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 1) return 0;
        return helper(s, new HashMap<>());
    }
    public static int helper(String testCase, HashMap<Character, Integer> countOfChars)
        {
        int end = testCase.length()-1;
        while (end >= 0) {
            Character currentChar = testCase.charAt(end);
            countOfChars.put(currentChar, countOfChars.getOrDefault(currentChar, 0) + 1);
               end--;
        }
        int start = 0;
        while(start <= testCase.length()-1) {
            if(countOfChars.get(testCase.charAt(start)) == 1 ) {
                return start;
            }
            start++;
        }
        return -1;
    }
}
*/
