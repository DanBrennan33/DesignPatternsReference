package strategy.pattern.choices;

public class SecondChoice  implements IChoice {
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers.");
        System.out.println("Result: " + s1 + s2);
        System.out.println("*** END OF STRATEGY ***");
    }
}
