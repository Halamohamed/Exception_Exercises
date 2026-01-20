package se.lexicon;

import se.lexicon.Exceptions.InsufficientBalanceException;
import se.lexicon.Exceptions.OutOfRangeException;

import java.util.InputMismatchException;

public class ExceptionsExercises {
    BankAccount account = new BankAccount(121, 100);

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

    // Exercise 2: Read an integer from the user and checks if it is in range(1-100). If not, throw an InputMismatchException and OutOfRangeException.
    public void exercise2() throws OutOfRangeException {
        try {
            IO.readln("Enter an integer between 1 and 100: ");
            String input= IO.readln();
            int number = Integer.parseInt(input);
            if(number < 1 || number > 100) {
                throw new OutOfRangeException("Input integer is not in the range 1-100 .");
            }
                IO.println("You entered: " + number);
        } catch (InputMismatchException | OutOfRangeException e) {
            IO.println("Error: Input integer is not in the range 1-100.");
        }
    }

    // Exercise 3: Implement a simple banking system with custom exceptions for insufficient funds and invalid account operations.
    public void exercise3() {
        BankAccount myAccount = new BankAccount(123, 100);
        IO.println(myAccount);
        try {
            myAccount.deposit(50);
            IO.println("Deposited 50. New balance: " + myAccount.getBalance());
            myAccount.withdraw(30);
            IO.println("Withdrew 30. New balance: " + myAccount.getBalance());
            myAccount.withdraw(150); // This should throw an exception
        } catch (InsufficientBalanceException e) {
            IO.println("Error: " + e.getMessage());
        }
    }
}
