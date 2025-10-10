/**
 * Class Name - Main.java
 * Description - This is the main class to test MyString methods
 * Author - Nandani Rathore
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        // Test append
        MyString m = new MyString("Nandani");
        System.out.println("After the append, the String is: " + m.append(" Rathore"));

        // Test word count
        MyString wc = new MyString();
        System.out.println("Total words: " + MyString.countWords(" he apple is my favourite fruit"));

        // Test replace character
        MyString re = new MyString("MAMDAMI");
        System.out.println("After Replacement: " + re.replaceChar('M', 'N'));

        // Test palindrome
        MyString pall = new MyString();
        System.out.println("Is Palindrome: " + MyString.isPalindrome("madam"));

        // Test splice
        MyString spl = new MyString();
        System.out.print("Splice output: ");
        MyString.splice("Code Up is a Good Academy.", 3, 7);

        // Test split
        System.out.println("Split output:");
        MyString.split("APPLE is good for health", 'g');

        // Test max repeating character
        MyString.maxRepeat("hello myself");

        // Test sort
        System.out.print("Sorted string: ");
        MyString.sort("apple is red.");

        // Test shift
        System.out.print("Shifted string: ");
        MyString.shift("Today's is monday", 7);

        // Test reverse
        System.out.print("Reversed string: ");
        MyString.reverse("RADHE KRISHNA");
    }
}
