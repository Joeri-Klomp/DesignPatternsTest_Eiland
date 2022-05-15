package be.vdab.designpatternstest_eiland.observer;

import be.vdab.designpatternstest_eiland.domain.Eiland;

public interface Observer {
    void update(Eiland eiland);
}
