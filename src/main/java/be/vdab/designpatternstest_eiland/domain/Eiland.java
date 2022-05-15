package be.vdab.designpatternstest_eiland.domain;

import be.vdab.designpatternstest_eiland.factory.InwonerFactory;
import be.vdab.designpatternstest_eiland.observer.Observer;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public enum Eiland {
    INSTANCE;
    private List<Inwoner> inwonerList= InwonerFactory.INSTANCE.getInwonersFromFile();
    private final Set<Observer> observers = new LinkedHashSet<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void simuleerVulkaanUitbarsting() {
        inwonerList.forEach(inwoner -> addObserver(inwoner));
        System.out.println("De vulkaan barst uit!! Wat een ravage.");
        notifyObservers();
    }
}
