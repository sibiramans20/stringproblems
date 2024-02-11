 public class StringCompression { 
    public static void main(String[] args) { 
        String input1 = "AAABBC"; 
        String compressed1 = compressString(input1); 
        System.out.println("Input: " + input1); 
        System.out.println("Output: " + compressed1); 
 
        String input2 = "AAABBCCCDE"; 
        String compressed2 = compressString(input2); 
        System.out.println("\nInput: " + input2); 
        System.out.println("Output: " + compressed2); 
    } 
 
    private static String compressString(String input) { 
        StringBuilder compressed = new StringBuilder(); 
        int count = 1; 
 
        for (int i = 0; i < input.length() - 1; i++) { 
            if (input.charAt(i) == input.charAt(i + 1)) { 
                count++; 
            } else { 
                compressed.append(input.charAt(i)); 
                if (count > 1) { 
                    compressed.append(count); 
                } 
                count = 1; 
            } 
        } 
        compressed.append(input.charAt(input.length() - 1)); 
        if (count > 1) { 
            compressed.append(count); 
        }
               return compressed.toString(); 
    } 
} 