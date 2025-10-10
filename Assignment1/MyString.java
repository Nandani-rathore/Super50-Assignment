/**
 * Class Name - MyString
 * Description - Implements various string manipulation methods such as append, replace, palindrome check,
 * splitting, sorting, reversing, etc.
 * 
 * -------------------- Author - Nandani Rathore ---------------------
 */

public class MyString {
    private String value;

    // Constructor with parameter
    public MyString(String str) {
        this.value = str;
    }

    // Default constructor
    public MyString() {
        this.value = "";
    }

    // Append another string to the current value
    public String append(String str) {
        this.value = this.value + str;
        return this.value;
    }

    // Count words in a string (based on spaces)
    public static int countWords(String input) {
        int count = 0;
        int start = 0;
        int end = input.length() - 1;

        // Trim leading spaces
        while (start <= end && input.charAt(start) == ' ') start++;

        // Trim trailing spaces
        while (end >= start && input.charAt(end) == ' ') end--;

        // Count spaces between words
        for (int i = start; i <= end; i++) {
            if (input.charAt(i) == ' ') {
                count++;
                while (i <= end && input.charAt(i) == ' ') i++;
            }
        }

        return count + 1; // number of words = spaces + 1
    }

    // Replace character ch1 with ch2
    public String replaceChar(char ch1, char ch2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.value.length(); i++) {
            char current = this.value.charAt(i);
            result.append(current == ch1 ? ch2 : current);
        }
        this.value = result.toString();
        return this.value;
    }

    // Check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Remove 'length' characters starting from index 'start'
    public static void splice(String str, int start, int length) {
        char[] result = new char[str.length() - length];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i < start || i >= start + length) {
                result[index++] = str.charAt(i);
            }
        }

        for (char c : result) System.out.print(c);
        System.out.println();
    }

    // Split the string based on a delimiter character
    public static void split(String str, char delimiter) {
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                for (int j = start; j < i; j++) System.out.print(str.charAt(j));
                System.out.println();
                start = i + 1;
            }
        }

        for (int i = start; i < str.length(); i++) System.out.print(str.charAt(i));
        System.out.println();
    }

    // Find the maximum repeating character in a string
    public static void maxRepeat(String str) {
        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Max repeating character: '" + maxChar + "' -> " + maxCount);
    }

    // Sort characters of a string alphabetically
    public static void sort(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (char c : arr) System.out.print(c);
        System.out.println();
    }

    // Circularly shift string characters by n positions
    public static void shift(String str, int n) {
        char[] shifted = new char[str.length()];
        int index = 0;

        // Move substring from n to end to start
        for (int i = n; i < str.length(); i++) shifted[index++] = str.charAt(i);
        // Move first n chars to the end
        for (int i = 0; i < n; i++) shifted[index++] = str.charAt(i);

        for (char c : shifted) System.out.print(c);
        System.out.println();
    }

    // Reverse a string
    public static void reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
