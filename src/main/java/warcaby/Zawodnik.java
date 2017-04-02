package warcaby;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andre on 29.03.2017.
 */
public class Zawodnik {
    private List<Pion> pions;


    public void ustawPiony(){
        for (int i = 0; i < 12; i++) {
            pions.add(new Pion());
        }
    }

    public void usunPion(Pion pion){
        pions.remove(pion);
    }
    
    
    public Zawodnik() {
        pions=new ArrayList<>();
        ustawPiony();
    }

    public List<Pion> getPions() {

        return pions;
    }

    public void setPions(List<Pion> pions) {
        this.pions = pions;
    }
}
