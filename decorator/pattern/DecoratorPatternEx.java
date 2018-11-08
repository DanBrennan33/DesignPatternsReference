package decorator.pattern;

public class DecoratorPatternEx {
    public static void main(String[] args) {
        System.out.println("***Decorator pattern Demo***");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx_1 cd1 = new ConcreteDecoratorEx_1();
        // Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1
        cd1.setTheComponent(cc);
        cd1.doJob();

        ConcreteDecoratorEx_2 cd2 = new ConcreteDecoratorEx_2();
        // Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1 &
        // ConcreteDecoratorEx_2
        cd2.setTheComponent(cd1);
        cd2.doJob();
    }
}
