package templatemethod.pattern;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        System.out.println("***TEMPLATE METHOD PATTERN DEMO***\n");

        BasicEngineering bs = new ComputerScience();
        System.out.println("Computer Sc Papers: ");
        bs.Papers();
        System.out.println();
        bs = new Electronics();
        System.out.println("Electronics Papers: ");
        bs.Papers();
    }
}
