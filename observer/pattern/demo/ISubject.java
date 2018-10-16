package observer.pattern.demo;

interface ISubject {
    void register(ObserverPattern o);
    void unregister(ObserverPattern o);
    void notifyObservers();
}