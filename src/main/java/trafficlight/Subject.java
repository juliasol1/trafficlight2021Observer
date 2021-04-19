package trafficlight;

import java.util.ArrayList;
import  java.util.List;

public class Subject {

    //here we create a new ArrayList of all our Observers

    private List<Observer> observers = new ArrayList<>();

    //both of these methods add and remove take an Observer as an argument - that is, the Observer to be added or removed

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    //This method is called to notify all observers (in our case currently only one) when the Subject's state has changed.

    public void notifyObserver() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
