/**
 * Exercise 9 — Fix the Declarations
 *
 * SIX of the lines below are broken. Find them, fix them,
 * and add a comment on each fixed line saying what was wrong.
 *
 * One of them compiles fine but is still a bad idea. Find that one too.
 */
public class BadVariables {
    public static void main(String[] args) {

        int secondPlace = 5;    // variable identifier can't start with number

        double price = 9.99;    // double can't be in quotes or it becomes a string

        boolean isReady = true; // boolean values must be true or false

        char grade = 'A';   // char must have single quotation

        int gradeLevel = 11;    // class is a reserved java keyword

        String name = "Sarah";  // variables start with lowercase

        int studentScore = 95;  // all variables need to be a singular word

        System.out.println("If this runs, you fixed them all.");
    }
}
