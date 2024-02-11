public class PalindromeChecker { 
    public static void main(String[] args) { 
        String input1 = "malayalam"; 
        System.out.println("Input: " + input1); 
        System.out.println("Output: " + isPalindrome(input1)); 
 
        String input2 = "m@ala$$y*a &lam"; 
        System.out.println("\nInput: " + input2); 
        System.out.println("Output: " + isPalindrome(input2)); 
 
        String input3 = "Something"; 
        System.out.println("\nInput: " + input3); 
        System.out.println("Output: " + isPalindrome(input3)); 
    } 
 
    private static boolean isPalindrome(String str) { 
        // Remove special characters and convert to lowercase 
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
 int left = 0; 
        int right = cleanedStr.length() - 1; 
 
        while (left < right) { 
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) { 
                return false; 
            } 
            left++; 
            right--; 
        } 
 
        return true; 
    } 
}