/**
 * Class Name - Main.java
 * Description - This is main class.
 * Author - Nandani Rathore
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        MyString m = new MyString("Nandani");
        System.out.println("After the append, the String is: " + m.append(" Rathore"));

        MyString wc = new MyString();
        System.out.println("Total words: " + wc.countfun(" he apple is my favourite fruit"));

        MyString re = new MyString("MAMDAMI");
        System.out.println("After Replacement: " + re.Myreplace('M', 'N'));

        MyString pall = new MyString();
        System.out.println("Is Pallindrome: " + pall.Pallindrom("madam"));

        MyString spl = new MyString();
        spl.splice("Code Up is a Good Academy.", 3, 7);

        spl.split("APPLE is good for health", 'g');

        spl.maxRepeat("hello myself");
    
        spl.sort("apple is red.");
        
        spl.shift("Today's is monday", 7);

        spl.reverse("RADHE KRISHNA");
    }
}
