import java.util.Random;
import java.util.Scanner;

public class Lottery 
{   // START OF Lottery class
    public static void main(String[] args)
    {   // START OF main method

        // Create Random object
        Random random = new Random();

        // Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Declare arrays
        int lottery [] = new int [5];
        int user [] = new int[5];

        // Declare variables
        int userInput;
        int matchingTotal = 0;

        // Generate random numbers for lottery array
        for(int i = 0; i < lottery.length; i++)
        {
            lottery[i] = random.nextInt(0, 9);
        }

        // Get user input
        for(int i = 0; i < user.length; i++)
        {
            System.out.print("Enter a number 0-9: ");
            userInput = keyboard.nextInt();

            // Input validation
            while(userInput < 0 || userInput > 9)
            {
                System.out.print("Invalid input. Please enter a number 0-9: ");
                userInput = keyboard.nextInt();
            }

            user[i] = userInput;
        }

        // Compare arrays
        for(int i = 0; i < lottery.length; i++)
        {
            if(user[i] == lottery[i])
            {
                matchingTotal += 1;
            }
        }

        // Display lottery array
        for(int i = 0; i < lottery.length; i++)
        {
            System.out.print(lottery[i] + " ");
        }

        // Display the number of matches
        System.out.print("\n");

        System.out.printf("You had %d matches!", matchingTotal);

        if(matchingTotal == lottery.length)
        {
            System.out.println("\nYou are the grand prize winner!");
        }

    }   // END OF main method

}   // END OF Lottery Class
