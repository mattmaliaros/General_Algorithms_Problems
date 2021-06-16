// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String originalString = "AAAABBBCCDAA";
        StringBuilder result = new StringBuilder();
        
        Character currentChar =  originalString.charAt(0);
        int count = 1;
        
        for(int i = 1; i < originalString.length(); i++) {
            if(currentChar == originalString.charAt(i)) {
                count++;
            }
            else{
                result.append(count);
                result.append(currentChar);
                count = 1;
                currentChar = originalString.charAt(i);
            }
        }
        if(result.charAt(result.length() - 1) != currentChar) {
            result.append(count);
            result.append(currentChar);
        }
        
        System.out.println(result);
    }
}
