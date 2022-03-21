package be.vdab.designpatternstest_eiland.domain;

public class Zoogdier extends Inwoner {
    public Zoogdier(String naam) {
        super(naam);
    }

    @Override
    public void schuilVoorVulkaanUitbarsting(Inwoner inwoner) {
        System.out.println(getNaam() + " kruipt zijn/haar hol in.");
    }
}
