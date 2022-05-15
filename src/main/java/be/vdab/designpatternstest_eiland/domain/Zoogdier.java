package be.vdab.designpatternstest_eiland.domain;

public class Zoogdier extends Inwoner {
    public Zoogdier(String naam) {
        super(naam);
    }

    @Override
    public void update(Eiland eiland) {
        System.out.println(getNaam() + " kruipt zijn/haar hol in.");
    }
}
