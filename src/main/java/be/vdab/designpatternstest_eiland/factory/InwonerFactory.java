package be.vdab.designpatternstest_eiland.factory;

import be.vdab.designpatternstest_eiland.domain.Inwoner;
import be.vdab.designpatternstest_eiland.domain.Vogel;
import be.vdab.designpatternstest_eiland.domain.Zoogdier;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InwonerFactory {
    private InwonerFactory() {}

    public static List<Inwoner> getInwonersFromFile() {
        List<Inwoner> inwonerList = new ArrayList<>();
        File file = new File("src/main/resources/Inwoners/inwoners.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null){
                switch (currentLine.charAt(0)) {
                    case 'V':
                        Vogel vogel = new Vogel(currentLine.substring(2));
                        inwonerList.add(vogel);
                        System.out.println("InwonerFactory - nieuwe inwoner gecreëerd van type Vogel: " + vogel);
                        break;

                    case 'Z':
                        Zoogdier zoogdier = new Zoogdier(currentLine.substring(2));
                        inwonerList.add(zoogdier);
                        System.out.println("InwonerFactory - nieuwe inwoner gecreëerd van type Zoogdier: " + zoogdier);
                        break;
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inwonerList;
    }
}
