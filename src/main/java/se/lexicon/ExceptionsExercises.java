package se.lexicon;

import java.util.InputMismatchException;

public class ExceptionsExercises {

    // Exercise 1 ask the user to input two integers and print the result of dividing the first number by the second.
    public void exercise1() {
        IO.readln("Enter first integer: ");
        String number1= IO.readln();
        IO.readln("Enter second integer: ");
        String number2= IO.readln();
        if(Integer.parseInt(number2) == 0){
            throw new ArithmeticException();
            //IO.println("Error: Division by zero is not allowed.");
        } else {
            double result =  Double.parseDouble(number1) / Double.parseDouble(number2);
            IO.println("Result: " + result);
        }

    }

    // Exercise 2: Read an integer from the user and checks if it is in range(1-100). If not, throw an InputMismatchException.
    public void exercise2() {
        IO.readln("Enter an integer between 1 and 100: ");
        String input= IO.readln();
        int number = Integer.parseInt(input);
        if(number < 1 || number > 100){
            throw new InputMismatchException();
        } else {
            IO.println("You entered: " + number);
        }
    }
}
