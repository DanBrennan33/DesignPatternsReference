package observer.pattern.demo;

import java.util.ArrayList;
import java.util.List;

class Subject implements ISubject {
    List<ObserverPattern> observerList = new ArrayList<ObserverPattern>();

    private int _flag;
    public int getFlag() {
        return _flag;
    }

    public void setFlag(int _flag) {
        this._flag = _flag;
        // flag value changed notify observer(s)
        notifyObservers();
    }

    @Override
    public void register(ObserverPattern o) {
        observerList.add(o);
    }

    @Override
    public void unregister(ObserverPattern o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }
}