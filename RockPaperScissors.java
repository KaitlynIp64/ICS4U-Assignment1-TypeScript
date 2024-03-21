/*
 * This program is the Rock-Paper-Scissors game
 *
 * By: Kaitlyn Ip 
 * Version: 1.0
 * Since: 2024-03-07
 */

import java.util.Scanner;

/**
 * The starting function.
 *
 */

final class RockPaperScissors {

    /**
     * Rock constant, 1.
     */
    public static final String ROCK = "rock";

    /**
     * Paper constant, 1.
     */
    public static final String PAPER = "paper";

    /**
     * Scissors constant, 1.
     */
    public static final String SCISSORS = "scissors";

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this is ever called
     *
     * @throws IllegalStateException if this is ever called
     *
     */

    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(String[] args) {
        // Generating random number between 0 and 2
        final Random randomNum = new Random();
        final int randomNumber = randomNum.nextInt(3);
        // Input
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Decide on a move (rock paper, or scissors): ");
        final String player = scanner.nextLine().toLowerCase();
        // Assigning computer's move based on the generated random number
        final String[] moves = {ROCK, PAPER, SCISSORS};
        final String computer = moves[randomNumber];
        // Process & Output
        if (player.equals(computer)) {
            System.out.println("\nComputer chose " + computer);
            System.out.println("\nTie.");
        } else if (
            ROCK.equals(player) && PAPER.equals(computer)
                || PAPER.equals(player) && SCISSORS.equals(computer)
                || SCISSORS.equals(player) && ROCK.equals(computer)
        ) {
            System.out.println("\nThe computer chose " + computer);
            System.out.println("\nYou lost.");
        } else if (
            PAPER.equals(player) && ROCK.equals(computer)
                || SCISSORS.equals(player) && PAPER.equals(computer)
                || ROCK.equals(player) && SCISSORS.equals(computer)
        ) {
            System.out.println("\nThe Computer chose " + computer);
            System.out.println("\nYou win!");
        } else {
            System.out.println("\nInvalid input.");
        }
        System.out.println("\nDone.");
    }
}
