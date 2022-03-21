package be.vdab.designpatternstest_eiland.domain;

import be.vdab.designpatternstest_eiland.factory.InwonerFactory;

import java.util.ArrayList;
import java.util.List;

public enum Eiland {
    INSTANCE;
    private List<Inwoner> inwonerList= InwonerFactory.getInwonersFromFile();

    public void addObserver(Inwoner inwoner) {
        inwonerList.add(inwoner);
    }

    public void removeObserver(Inwoner inwoner) {
        inwonerList.remove(inwoner);
    }

    public void simuleerVulkaanUitbarsting() {
        System.out.println("De vulkaan barst uit!! Wat een ravage.");
        inwonerList.forEach(inwoner -> inwoner.schuilVoorVulkaanUitbarsting(inwoner));
    }
}
