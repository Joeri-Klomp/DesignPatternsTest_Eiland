package be.vdab.designpatternstest_eiland.Main;

import be.vdab.designpatternstest_eiland.domain.Eiland;
import be.vdab.designpatternstest_eiland.domain.Vogel;
import be.vdab.designpatternstest_eiland.domain.Zoogdier;
import be.vdab.designpatternstest_eiland.factory.InwonerFactory;

import java.io.*;

public class EilandMain {
    public static void main(String[] args) {
        Eiland.INSTANCE.simuleerVulkaanUitbarsting();
    }
}
