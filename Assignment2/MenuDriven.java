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
public class MenuDriven {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- choose any one ---");
            System.out.println("1. Count Unique Palindromes");
            System.out.println("2. Fibonacci Sequence - Nth Number");
            System.out.println("3. Snake Case to Camel Case Conversion");
            System.out.println("4. Count Consonants in a String");
            System.out.println("5. Binary to Decimal Conversion");
            System.out.println("6. Expand Characters in a String");
            System.out.println("7. Character Frequency in a String");
            System.out.println("8. Prime Number Checker");
            System.out.println("9. Number to Words Converter");
            System.out.println("10. Longest Substring Without Repeating Characters");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

             switch(choice) {
                case 1: Implementation.countUniquePalindromes(); break;
                case 2: Implementation.fibonacciNumber(); break;
                case 3: Implementation.snakeToCamel(); break;
                case 4: Implementation.countConsonants(); break;
                case 5: Implementation.binaryToDecimal(); break;
                case 6: Implementation.expandCharacters(); break;
                case 7: Implementation.charFrequency(); break;
                case 8: Implementation.primeChecker(); break;
                case 9: Implementation.numberToWords(); break;
                case 10: Implementation.longestSubstringWithoutRepeating(); break;
                case 11: System.out.println("Exiting the program. Thank you!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while(choice != 11);
    }
}
