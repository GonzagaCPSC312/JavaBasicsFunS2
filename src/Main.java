import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * a block comment
 * (a multi line comment)
 * the two stars denotes a javadoc comment (don't need javadoc for this class)
 */

// one line comment

// every public type must be in its own file
// e.g. Main in Main.java
// 4 access modifiers
// 1. public (accessible anywhere)
// 2. private
// 3. protected
// 4. package-private (omit modifier)
public class Main {
    public static final int CONSTANT_NUMBER = 5;

    public static void main(String[] args) {
        // static means class-level (as opposed to instance-level)
        // said another way, static means no "this" reference
        // String[] is the type of the parameter args (cmd line args)

        // VARIABLES
        // a variable is either a primitive (8 types) or a reference
        // 1. char
        char myChar = 'a';
        // 2. int
        // 3. float 4. double
        double myDouble = 3.1415;
        System.out.println("myDouble: " + myDouble);
        // 2 ways to format a double
        System.out.printf("%.2f\n", myDouble);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println(formatter.format(myDouble));
        // CONSTANTS
        // use the final keyword
        // use MACRO_CASE by convention (as opposed camelCase for identifiers and PascalCase for types)
        System.out.println(Main.CONSTANT_NUMBER);
        System.out.println(Math.PI);
        // 5. boolean
        boolean myBool = true; // false
        // 6. long 7. short 8. byte

        // STRINGS
        // a String is of type String (the class)
        // means, we get access to attribute and methods (member functions)
        // lots of great string methods: charAt() toCharArray() trim() toUpperCase() ...
        String myString = "hello";
        // task 1: declare 2 strings, one for your first name, and one for your last
        // print out <first name> <last name> has <# of letters> letters in it
        String firstName = "gina";
        String lastName = "sprint";
        int numLetters = firstName.length() + lastName.length();
        System.out.println(firstName + " " + lastName + " has " + numLetters + " letters in it");

        // ARRAYS (and a bit about LISTS)
        // similar to C++
        // can declare and initialize at the same time
        int[] myInts = {3, 4, 5, 6};
        System.out.println("myInts: " + myInts); // prints out a hashcode
        System.out.println("myInts: " + Arrays.toString(myInts));
        // task 2: create an array of 4 of your friends' names
        // print the array, print the number of elements, and the last element
        final int NUM_FRIENDS = 4;
        String[] myFriends = new String[NUM_FRIENDS];
        myFriends[0] = "Joey";
        myFriends[1] = "Monica";
        myFriends[2] = "Phoebe";
        myFriends[3] = "Chandler";
        System.out.println(Arrays.toString(myFriends) + " " + myFriends.length + " " + myFriends[myFriends.length - 1]);

        // CONTROL FLOW
        // similar to C++
        // if/else if/else switch while/do-while/for loops are the same
        // range-base for loop (for-each loop)
        for (String friend : myFriends) {
            System.out.println(friend);
        }
        // task 3: print out the first 20 even numbers on the same line
        // 2 4 6 ... 38 40
        for (int i = 2; i <= 40; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // METHODS
        // also super similar to C++
        // use static for class-level methods (don't need an object to invoke it)
        // task 4: define/call a static method that accepts 2 strings
        // return true if they have the same last character, false otherwise
        // start thinking about special cases!!
        System.out.println(hasSameLastCharacter("first", "last"));
        System.out.println(hasSameLastCharacter("first", "zags"));
        System.out.println(hasSameLastCharacter("first", null));

        // RANDOM NUMBERS
        // create a Random object
        Random random = new Random();
        int randInt = random.nextInt(10); // [0, 10)
        System.out.println("randInt: " + randInt);

        // USER INPUT (not needed for Android)
        // use the Scanner class for input from keyboard (System.in) and from a File
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your favorite number: ");
        int favNum = kb.nextInt();
        kb.nextLine(); // flush the pesky newline character out
        System.out.println("Favorite number: " + favNum);
        System.out.println("Enter your favorite place: ");
        String favPlace = kb.nextLine();
    }

    public static boolean hasSameLastCharacter(String first, String second) {
        // check if first and second are valid references
        if (first != null && second != null) {
            if (first.length() > 0 && second.length() > 0) {
                if (first.charAt(first.length() - 1) == second.charAt(second.length() - 1)) {
                    return true;
                }
            }
        }
        // (can be written more concisely)
        return false;
    }
}
