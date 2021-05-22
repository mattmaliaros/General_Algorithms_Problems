Two pointers at the starting digit and the ending digit. We convert the number to a string and work our way towards the middle.

class Solution {
    public boolean isPalindrome(int x) {
        int start = 0 ;  //first digit
        int end = Integer.toString(x).length() - 1;  // last digit
        String stringNum =  Integer.toString(x); // Convert the number to a string  
        
		
        while (start <= end) {
		// If these match, we increment to move to the next digits.  For example:
		// 1 2 2 1   (S = Start, E = End) Compare's the 1's
		// S     E   --- Start++ End-- 
		//   S E     --- Compares the 2's which are equal, so we increment start and decrement end.   
		// Since start > end, the program returns true.
		
            if (stringNum.charAt(start) == stringNum.charAt(end)) {
                start++;
                end--;
            }
            else{
			// No match, it's not a palindrome
                return false;
            }
        }
		// All matches
        return true;
    }
}