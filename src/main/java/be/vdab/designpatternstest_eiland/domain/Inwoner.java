package be.vdab.designpatternstest_eiland.domain;

import be.vdab.designpatternstest_eiland.observer.Observer;

abstract public class Inwoner implements Observer {
    private final String naam;

    public Inwoner(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Inwoner{");
        sb.append("naam='").append(naam).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
