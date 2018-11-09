package question4;

/**
 *
 */

import java.util.Random;

public class RandomSumGame {
    boolean start;
    int d1;
    int d2;
    int sum;
    int valuePoint;
    String status;

    /**
     *
     * @param d1
     * @param d2
     */
    public void play(int d1, int d2) {
        status = "";
        if (sum == 2 || sum == 3 || sum == 12) {
            start = false;
            status = "you lose";
            System.out.println(status);
        } else if (sum == 7 || sum == 11) {
            start = false;
            status = "you win";
            System.out.println(status);
        } else {
            start = true;
            System.out.println("you establish the value point " + sum + ";");
            valuePoint = sum;
            status = "";
        }
    }

    /**
     *
     */
    public void play() {
        int gamesPlayed = 0;
        int win = 0;
        int lose = 0;
        do {
            sum = 0;
            rollDice();
            sum = d1 + d2;
            System.out.print("You rolled " + d1 + " + " + d2 + " = " + sum + ";");
            play(d1, d2);
            while (start) {
                rollDice();
                sum = d1 + d2;
                System.out.print("-- Roll again " + d1 + " + " + d2 + " = " + sum + ";");
                if (sum == 7) {
                    status = "you lose";
                    System.out.println(status);
                    start = false;
                } else {
                    if (sum == valuePoint) {
                        status = "you win";
                        System.out.println(status);
                        start = false;
                    } else {
                        System.out.println("roll");
                    }
                }
            }
            if (status == "you win")
                win++;
            else
                lose++;
            gamesPlayed++;
        } while (gamesPlayed < 3);
        System.out.println("You won " + win + " games out of 3.");
        System.out.println("You lost " + lose + " games out of 3.");
    }

    /**
     *
     */
    public void rollDice() {
        d1 = 0;
        d2 = 0;
        Random rand = new Random();
        d1 = rand.nextInt((6 - 1) + 1) + 1;
        d2 = rand.nextInt((6 - 1) + 1) + 1;
    }
}
