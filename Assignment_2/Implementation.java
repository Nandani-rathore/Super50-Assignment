/*
 * class Name - Menu Driven program 
 * Description - this class will able to do operations such as 
 * 1. count unique pallindrome 
 * 2.Fbonacci number
 * 3. snake case to camel case 
 * 4.count consonent 
 * 5. convert binary to decimal number 
 * 6. expand teh character 
 * 7. find character frequency
 * 8. prime no checker 
 * 9. number to word conversion 
 * 10. longest substring without repeating 
 * -------------------- Author - Nandani Rathore ---------------------
 */

import java.util.*;

public class Implementation {
     static Scanner sc = new Scanner(System.in);
        static void countUniquePalindromes() {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Set<String> palindromes = new HashSet<>();
        int n = s.length();
        for(int i = 0; i < n; i++) {
            // Odd length palindromes
            expandPalindrome(s, i, i, palindromes);
            // Even length palindromes
            expandPalindrome(s, i, i+1, palindromes);
        }
        System.out.println("Number of unique palindromes: " + palindromes.size());
        System.out.println("Palindromes: " + palindromes);
    }
    static void expandPalindrome(String s, int left, int right, Set<String> set) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if(right - left + 1 > 1) // only count length >=2
                set.add(s.substring(left, right+1));
            left--;
            right++;
        }
    }

    // 2. Fibonacci Sequence – Nth Number
    static void fibonacciNumber() {
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        long a = 0, b = 1, c = 0;
        if(n == 1) c = 0;
        else if(n == 2) c = 1;
        else {
            for(int i=3; i<=n; i++){
                c = a + b;
                a = b;
                b = c;
            }
        }
        System.out.println("Fibonacci number at position " + n + " is: " + c);
    }

 // 3. Snake Case to Camel Case Conversion
    static void snakeToCamel() {
        System.out.print("Enter snake_case string: ");
        String s = sc.nextLine();
        String[] parts = s.split("_");
        StringBuilder camel = new StringBuilder(parts[0]);
        for(int i=1; i<parts.length; i++) {
            camel.append(parts[i].substring(0,1).toUpperCase() + parts[i].substring(1));
        }
        System.out.println("CamelCase: " + camel);
    }
    
    
    // 4. Count Consonants in a String
    static void countConsonants() {
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) count++;
        }
        System.out.println("Number of consonants: " + count);
    }
    
    // 5. Binary to Decimal Conversion
    static void binaryToDecimal() {
        System.out.print("Enter binary string: ");
        String s = sc.nextLine();
        try {
            int decimal = Integer.parseInt(s, 2);
            System.out.println("Decimal: " + decimal);
        } catch(NumberFormatException e) {
            System.out.println("Invalid binary number!");
        }
    }
    
    // 6. Expand Characters in a String
    static void expandCharacters() {
        System.out.print("Enter string (like a1b2): ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i+=2) {
            char ch = s.charAt(i);
            int times = Character.getNumericValue(s.charAt(i+1));
            for(int j=0; j<times; j++) sb.append(ch);
        }
        System.out.println("Expanded string: " + sb);
    }
    
    // 7. Character Frequency in a String
    static void charFrequency() {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Map<Character,Integer> freq = new LinkedHashMap<>();
        for(char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c,0)+1);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : freq.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println("Compressed frequency: " + sb);
    }
    
    // 8. Prime Number Checker
    static void primeChecker() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n < 2) {
            System.out.println("The given number is NOT prime");
            return;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.println("The given number is NOT prime");
                return;
            }
        }
        System.out.println("The given number is PRIME");
    }
    
    // 9. Number to Words Converter
    static void numberToWords() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println("zero");
            return;
        }
        System.out.println(convertNumberToWords(n).trim());
    }
    
    static String[] belowTwenty = {"","one","two","three","four","five","six","seven","eight","nine","ten",
                                   "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
                                   "eighteen","nineteen"};
    static String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    
    static String convertNumberToWords(int n) {
        if(n < 20) return belowTwenty[n];
        else if(n < 100) return tens[n/10] + " " + belowTwenty[n%10];
        else if(n < 1000) return belowTwenty[n/100] + " hundred " + convertNumberToWords(n%100);
        else if(n < 1000000) return convertNumberToWords(n/1000) + " thousand " + convertNumberToWords(n%1000);
        else return convertNumberToWords(n/1000000) + " million " + convertNumberToWords(n%1000000);
    }
    
    // 10. Longest Substring Without Repeating Characters
    static void longestSubstringWithoutRepeating() {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        int maxLen = 0, left = 0;
        for(int right=0; right<s.length(); right++) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println("Length of longest substring without repeating characters: " + maxLen);

    }
}
