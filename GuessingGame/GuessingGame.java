import javax.swing.*;

public class GuessingGame {
    public static void main(String args[]) {
        int computerNumber = (int) (Math.random() * 100 + 1);
        int useranswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;
        while (useranswer != computerNumber) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            useranswer = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null, "" + determineGuess(useranswer, computerNumber, count));
            count++;

        }
    }

    public static String determineGuess(int useranswer, int computerNumber, int count) {
        if (useranswer <= 0 || useranswer > 100) {
            return ("Your guess is Invalid");
        } else if (useranswer == computerNumber) {
            return ("Correct Answer\n\nTotal Guesses:" + count);
        } else if (useranswer > computerNumber) {
            return ("Your number is too high try again.\n Try number :" + count);
        } else if (useranswer < computerNumber) {
            return ("Your number is too low, Try again.\n Try number:" + count);
        } else {
            return ("Your Guess is incorrect.\n Try number:" + count);
        }
    }
}
