package be.vdab.designpatternstest_eiland.domain;

public class Vogel extends Inwoner {
    public Vogel(String naam) {
        super(naam);
    }

    @Override
    public void schuilVoorVulkaanUitbarsting(Inwoner inwoner) {
        System.out.println(getNaam() + " zoekt de veiligheid op door hoger te gaan vliegen!");
    }
}
