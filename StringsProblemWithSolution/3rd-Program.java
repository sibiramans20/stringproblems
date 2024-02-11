 public class NumberToWords { 
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", 
"Eight", "Nine"}; 
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", 
"Sixteen", "Seventeen", "Eighteen", "Nineteen"}; 
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", 
"Seventy", "Eighty", "Ninety"}; 
 
    public static void main(String[] args) { 
        int input = 1213; 
        String words = convertToWords(input); 
        System.out.println("Input: " + input); 
        System.out.println("Output: " + words); 
    } 
 
    private static String convertToWords(int number) { 
        if (number == 0) { 
            return "Zero"; 
        } 
        return convertToWordsHelper(number); 
    } 
 
    private static String convertToWordsHelper(int number) { 
        if (number < 10) { 
            return units[number]; 
        } else if (number < 20) { 
            return teens[number - 10]; 
        } else if (number < 100) { 
 return tens[number / 10] + " " + convertToWordsHelper(number % 10); 
        } else if (number < 1000) { 
            return units[number / 100] + " Hundred " + convertToWordsHelper(number % 100); 
        } else if (number < 10000) { 
            return convertToWordsHelper(number / 1000) + " Thousand " + 
convertToWordsHelper(number % 1000); 
        } else { 
            return convertToWordsHelper(number / 10000) + " Ten Thousand " + 
convertToWordsHelper(number % 10000); 
        } 
    } 
}