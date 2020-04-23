import java.util.Scanner;

public class CoinCounting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompting the user to enter an amount
        System.out.print("Please enter a number: ");
        double amount = input.nextDouble();

        // Converting the amount into cents
        int remainingAmount = (int) (amount * 100); // PUT THE WHOLE EXPRESSION IN PARENTHESES. Otherwise, THE WHOLE CODE WILL NOT WORK.

        // Converting the cents into dollar
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Finding the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Finding the number of dimes
        int numberOfDimes = numberOfQuarters / 10;
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
