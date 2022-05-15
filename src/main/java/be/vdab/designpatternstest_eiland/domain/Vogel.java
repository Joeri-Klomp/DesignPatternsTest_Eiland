package be.vdab.designpatternstest_eiland.domain;

public class Vogel extends Inwoner {
    public Vogel(String naam) {
        super(naam);
    }

    @Override
    public void update(Eiland eiland) {
        System.out.println(getNaam() + " zoekt de veiligheid op door hoger te gaan vliegen!");
    }
}
