/*1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won. */

/*______________________________________________________________________________________________ */

import java.util.Scanner;
import java.util.Random;

public class NumGame {
    public static void main(String[] args) {
        // first of all i have to generate a random number . I will do this with the
        // help of Random class in the util package

        Random x = new Random();
        int generated_number = x.nextInt(10); // here
        System.out.println(generated_number);
        System.out.println("Here the system has generated the random number " + " you have to guess the number on your"
                + "own to match the generated number under fewer number of chances else  you will lose the match");

        Scanner sc = new Scanner(System.in);

        int ch;

        System.out.println("Press 1 to start the game");
        System.out.println();
        System.out.println("press 0 to exit the game");
        System.out.println();
     

        ch = sc.nextInt();
        
        switch (ch) {
            case 1:
                int guess_number;

                boolean player_won = false;

                System.out.println(
                        "________________________________________________________________________________________");
                System.out.println();

                System.out.println("YOu have only three chances ");
                System.out.println(
                        "________________________________________________________________________________________");
                System.out.println();

                for (int chances = 1; chances <= 3; chances++) {

                    System.out.println("Chance Number  =" + chances);

                    System.out.print("Guess the number=");
                    guess_number = sc.nextInt();

                    if (guess_number == generated_number) {

                        player_won = true;

                        break;

                    } else if (guess_number < generated_number) {
                        System.out.println("Your guess is low ");
                        System.out.println(
                                "________________________________________________________________________________________");

                    } else if (guess_number > generated_number) {
                        System.out.println("your guess is high");
                        System.out.println(
                                "________________________________________________________________________________________");

                    }

                    if (player_won == true) {
                        break;
                    }

                }
                if (player_won) {
                    System.out.println("Congratulations ! You have guess the right number ");
                } else {
                    System.out.println("Oops! you are not able to guess the number better luck next time");
                }
                System.out.println("____________________________________________________________________________");
                System.out.println("----------------------------------------------------------------------------");

              

           case 0:
           System.out.println("Thanks for playing the game");




        }
        
         

    }

}
