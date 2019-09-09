import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Create a program that will allow users to enter a word, and a character number index.
//        Your program will print out the size of the word, as well as the substring (starting from 0)
//        to the index the user specified. If the user entered index is larger than the size of the word,
//        the program will print "Index is larger than length".
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a string to test: ");
        System.out.println("");

        String tstStr = keyboard.nextLine();

        System.out.println("Enter a number as an index");
        System.out.println("");

        int tstIndex = keyboard.nextInt();
        System.out.println("You have specified index= " + tstIndex + " of " + tstStr);
        System.out.println("This gives character: "+ tstStr.charAt(tstIndex));

//        String text = "Hello World!";
//        String another = "Today is going to be a beautiful day!";
//
//        System.out.println("Using .length(): " );
//        System.out.println("The amount of characters in this word is : " + text.length());
//        System.out.println("The amount of characters in this other word is : " + another.length());
//
//        System.out.println("Using .substring(): " );
//        System.out.println("The section of word from index 0-5 is : " + text.substring(0,5));
//        System.out.println("The section of word from index 5-10 is : " + another.substring(5,10));
//
//        System.out.println("Using .charAt(): " );
//        System.out.println("The character at index 1 is : " + text.charAt(1));
//        System.out.println("The character at index 10 is : " + another.charAt(10));
    }
}
