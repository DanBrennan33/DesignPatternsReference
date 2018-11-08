package decorator.pattern;

public class ConcreteDecoratorEx_2  extends AbstractDecorator {
    public void doJob() {
        System.out.println("");
        System.out.println("***START Ex_2***");
        super.doJob();
        // Add additional thing if necessary
        System.out.println("Explicitly from DecoratorEx_2");
        System.out.println("***END***");
    }
}
