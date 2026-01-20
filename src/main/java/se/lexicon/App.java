package se.lexicon;

import se.lexicon.Exceptions.OutOfRangeException;

import java.util.InputMismatchException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       ExceptionsExercises exercises = new ExceptionsExercises();
        // Exercise 1: Handle ArithmeticException
         try {
              //  exercises.exercise1();
            } catch (ArithmeticException e) {
                IO.println("Error: Division by zero is not allowed.");
         }

         // Exercise 2: Handle InputMismatchException
            /*try {
                exercises.exercise2();
            } catch ( OutOfRangeException e) {
                IO.println(e.getMessage());
            }*/

        // Exercise 3: Handle InsufficientBalanceException
            exercises.exercise3();
    }
}
