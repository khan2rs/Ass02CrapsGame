import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        //import
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        //playing? y/n
        boolean playing = false;
        String playAgain = "";

        String trash = "";
        //ints for dice 1 and dice 2
        int newRoll = 0;
        int dice1 = rnd.nextInt(6) + 1;
        int dice2 = rnd.nextInt(6) + 1;
        //goofy lil intro
        System.out.println("Welcome to the game of CRAPS! Roll a 7 or 11 to win.");
        do {
            dice1 = rnd.nextInt(6) + 1;
            dice2 = rnd.nextInt(6) + 1;

            int crapsRoll = dice1 + dice2;

            System.out.println("The value of D1 is: " + dice1 + " and the value of D2 is: " + dice2);
            System.out.println("Craps =  " + crapsRoll);
            System.out.println();
            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("Craps! You lose...");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("Yay, you win!");
            } else {
                System.out.println("Continue until you get 7!");

                while (newRoll != crapsRoll && newRoll != 7) {

                    dice1 = rnd.nextInt(6) + 1;
                    dice2 = rnd.nextInt(6) + 1;

                    newRoll = dice1 + dice2;

                    System.out.println("The value of D1 is: " + dice1 + " and the value of D2 is: " + dice2);
                    System.out.println("Craps = " + newRoll);
                    if (newRoll == crapsRoll) {
                        System.out.println("Yay, you win!");

                    } else if (newRoll == 7) {
                        System.out.println("Craps! You lose...");
                    } else {
                        System.out.println("Continue?");
                        System.out.println();
                    }

                }

            }

            System.out.print("\nPlay again? [Y/N]: ");
            if (in.hasNextLine()) {
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("y")) {
                    playing = true;
                } else if (playAgain.equalsIgnoreCase("n")) {
                    playing = false;
                } else {
                    System.out.println("Invalid input, please try again:");
                }
            } else {
                System.out.println("Invalid input, please try again:");
            }
        } while (playing);
    }
}