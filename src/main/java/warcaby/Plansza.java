package warcaby;

import java.util.ArrayList;

/**
 * Created by andre on 29.03.2017.
 */
public class Plansza {
    private Pole[][] plansza;


    public void rozstawPiony() {
        Zawodnik bialy = new Zawodnik();
        Zawodnik czarny = new Zawodnik();
        ArrayList<Pole> pom = new ArrayList<>();

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[0].length; j++) {
                if(pom.size()<czarny.getPions().size() && plansza[i][j].getPoleDoGry()==true){
                    pom.add(plansza[i][j]);
                }

            }
        }

    }


    public void createPlansza() {
        plansza = new Pole[8][8];
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[0].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 > 0) {
                        plansza[i][j] = new Pole(true, null);
                    } else
                        plansza[i][j] = new Pole(false, null);
                } else {
                    if (j % 2 == 0) {
                        plansza[i][j] = new Pole(true, null);
                    } else
                        plansza[i][j] = new Pole(false, null);
                }
            }
        }
    }
}
