import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        Scanner in = new Scanner(System.in);
        String playerAChoice = "";
        String playerBChoice = "";
        String playAgainAnswer = "";
        boolean playAgain = true;
        boolean inputAFail = false;
        boolean inputBFail = false;

        // THE GAME
        do {

            // Player A: Repeat input if fails
            do {

                System.out.println("Welcome to Rock, Paper, Scissors!");
                System.out.println("Player A, choose Rock, Paper, or Scissors (R, P, S): ");

                playerAChoice = in.nextLine();

                if (playerAChoice.equals("R")) {
                    System.out.println("Player A entered Rock.");
                } else if (playerAChoice.equals("P")) {
                    System.out.println("Player A entered Paper.");
                } else if (playerAChoice.equals("S")) {
                    System.out.println("Player A entered Scissors");
                } else {
                    System.out.println("Please enter a valid move (R, P, S).");
                    inputAFail = true;
                }
            } while (inputAFail == true);

            // Player B: Repeat input if fails
            do {

                System.out.println("Player B, choose Rock, Paper, or Scissors (R, P, S): ");

                playerBChoice = in.nextLine();

                if (playerBChoice.equals("R")) {
                    System.out.println("Player A entered Rock.");
                } else if (playerBChoice.equals("P")) {
                    System.out.println("Player A entered Paper.");
                } else if (playerBChoice.equals("S")) {
                    System.out.println("Player A entered Scissors");
                } else {
                    System.out.println("Please enter a valid move (R, P, S).");
                    inputBFail = true;
                }
            } while (inputBFail == true);

            // Determining Outcome

            if (playerAChoice.equals("R") && (playerBChoice.equals("R"))) {
                System.out.println("Rock can't beat rock. It's a tie.");
            } else if (playerAChoice.equals("R") && (playerBChoice.equals("P"))) {
                System.out.println("Paper beats rock. Player B wins!");
            } else if (playerAChoice.equals("R") && (playerBChoice.equals("S"))) {
                System.out.println("Rock beats scissors. Player A wins!");
            } else if (playerAChoice.equals("P") && (playerBChoice.equals("R"))) {
                System.out.println("Paper beats rock. Player A wins!");
            } else if (playerAChoice.equals("P") && (playerBChoice.equals("P"))) {
                System.out.println("Paper can't beat paper. It's a tie.");
            } else if (playerAChoice.equals("P") && (playerBChoice.equals("S"))) {
                System.out.println("Scissors beats paper. Player B wins!");
            } else if (playerAChoice.equals("S") && (playerBChoice.equals("R"))) {
                System.out.println("Rock beats scissors. Player B wins!");
            } else if (playerAChoice.equals("S") && (playerBChoice.equals("P"))) {
                System.out.println("Scissors beats paper. Player A wins!");
            } else if (playerAChoice.equals("S") && (playerBChoice.equals("S"))) {
                System.out.println("Scissors can't beat scissors. It's a tie.");
            }

            System.out.println("Play again? Y/N: ");
            playAgainAnswer = in.nextLine();

            if (playAgainAnswer.equals("Y")) {
                playAgain = true;
            } else {
                playAgain = false;
            }

        } while (playAgain == true);


        System.out.println("Thanks for playing!");
    }
}