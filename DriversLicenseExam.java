import java.util.Scanner;

public class DriversLicenseExam 
{   // START OF DriversLicenseExam class

    public static void main(String[] args)
    {   // START OF main method

        // Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Create array of correct answers
        String [] correctAnswers = {"A", "D", "B", "B", "C", "B", "A", "B", "C", "D", "A", "C", "D", "B", "D", "C", "C", "A", "D", "B"};
        String [] userAnswers = new String [20];
        int [] incorrectAnswerNumbers = new int [20];

        // Declare variables
        String answer;

        double correctTotal = 0;
        int incorrectTotal = 0;

        // Iterate through correctAnswers array
        for(int i = 0; i < correctAnswers.length; i++)
        {
            // Ask user for answer
            System.out.printf("Enter Answer for question %d: ", i + 1);
            answer = keyboard.nextLine();

            // Input validation
            while(!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B") && !answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("D"))
            {
                System.out.print("Invalid Answer. Enter A, B, C, or D: ");
                answer = keyboard.nextLine();
            }

            // Add user answer to array
            userAnswers[i] = answer;

            // Determine if the users answer is correct
            if(answer.equalsIgnoreCase(correctAnswers[i]))
            {
                correctTotal += 1;
            }
            else if(answer.equalsIgnoreCase(correctAnswers[i]) == false)
            {
                incorrectTotal += 1;
                incorrectAnswerNumbers [i] = i + 1;
            }
        }


        System.out.println("");

        // Display if the user passed or failed
        if(correctTotal / correctAnswers.length > 0.75)
        {
            System.out.println("You passed your driver's license exam!");
        }
        else if(correctTotal / correctAnswers.length < 0.75)
        {
            System.out.println("You failed the exam.");
        }
        
        // Display total number of correct and incorrect answers
        System.out.printf("Correct Answers: %.0f", correctTotal);

        System.out.println("");

        System.out.printf("Incorrect Answers: %d", incorrectTotal);

        // Display the questions the user answered incorrectly
        System.out.println("");

        System.out.printf("You answered incorrectly for questions ");
        for(int i = 0; i < incorrectAnswerNumbers.length; i++)
        {
            if(incorrectAnswerNumbers[i] > 0)
            {
                System.out.print(incorrectAnswerNumbers[i] + ", ");
            }
        }

    }   // END OF main method
}   // END OF DriversLicenseExam class
