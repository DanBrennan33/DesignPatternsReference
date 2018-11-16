package strategy.pattern.demo;

import strategy.pattern.choices.FirstChoice;
import strategy.pattern.choices.IChoice;
import strategy.pattern.choices.SecondChoice;
import strategy.pattern.contextofchoice.Context;

import java.util.Scanner;

public class StrategyPatternExec {
    public static void main(String[] args) {
        System.out.println("*** STRATEGY PATTERN START ***");
        Scanner in = new Scanner(System.in);
        IChoice ic = null;
        Context cxt = new Context();
        String input1, input2;
        try {
            for (int i = 1; i <= 2; i++) {
                System.out.print("Enter an interger: ");
                input1 = in.nextLine();
                System.out.print("Enter an integer: ");
                input2 = in.nextLine();
                System.out.print("Enter choice (1 or 2): ");
                String c = in.nextLine();

                if (c.equals("1"))
                    ic = new FirstChoice();
                else
                    ic = new SecondChoice();
                cxt.setChoice(ic);
                cxt.showChoice(input1, input2);
            }
        } finally {
            in.close();
        }
        System.out.println("END OF STARTEGY PATTERN");
    }
}
