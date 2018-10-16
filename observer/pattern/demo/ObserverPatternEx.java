package observer.pattern.demo;

public class ObserverPatternEx {
    public static void main(String[] args) {
        System.out.println("Observer Pattern Demo");
        ObserverPattern o1 = new ObserverPattern();
        Subject sub1 = new Subject();
        sub1.register(o1);
        System.out.println("Setting Flag = 5 ");
        sub1.setFlag(5);
        System.out.println("Setting Flag = 25 ");
        sub1.setFlag(25);
        sub1.unregister(o1);
        //No notification this time to o1 .Since it is unregistered.
        System.out.println("Setting Flag = 50 ");
        sub1.setFlag(50);
    }
}
