package warcaby;

/**
 * Created by andre on 29.03.2017.
 */
public class Pole {
    protected boolean poleDoGry;
    protected Pion pion;


    Pole(boolean poleDoGry, Pion pion){
        this.pion=pion;
        this.poleDoGry=poleDoGry;
    }


    public void setPoleDoGry(boolean poleDoGry){
        this.poleDoGry=poleDoGry;
    }
    public void setPion(Pion pion){
        this.pion=pion;
    }
    public boolean getPoleDoGry(){
        return poleDoGry;
    }
    public Pion getPion(){
        return pion;
    }


}
