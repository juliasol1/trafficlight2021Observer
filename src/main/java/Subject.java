import trafficlight.gui.TrafficLight;

import java.util.ArrayList;
import  java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver(TrafficLight light) {
        for (Observer observer : this.observers) {
            observer.update(light);
        }
    }

}
