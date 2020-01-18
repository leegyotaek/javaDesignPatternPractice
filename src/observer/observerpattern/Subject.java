package observer.observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<Observer>();

    public void attatch(Observer observer){
        observers.add(observer);
    }
    public void detatch(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers() {
        observers.stream().forEach(observer -> {
            observer.update();
        });
    }

}
