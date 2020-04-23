/* Problem: Write a program that prompts users for a decimal number, then converts that number into a dollar amount.
Next, count the number of coins in each type that make up said dollar amount. */ 

import java.util.Scanner;

public class CoinCounting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompting the user to enter an amount
        System.out.print("Please enter a number: ");
        double amount = input.nextDouble();

        // Converting the amount into cents
        int remainingAmount = (int) (amount * 100); // PUT THE WHOLE EXPRESSION IN PARENTHESES. 
        
        // Finding the number of dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Finding the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Finding the number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Finding the number nickels
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Finding the number of pennies
        int numberOfPennies = remainingAmount;

        input.close();
        
        System.out.println("Your total amount is: " + amount + " dollars");
        System.out.println("You have: " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes") ;
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
