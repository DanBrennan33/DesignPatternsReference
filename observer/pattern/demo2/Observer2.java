package observer.pattern.demo2;

public class Observer2 implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("Observer2: observes ->myValue in Subject to: " + i);
    }
}
