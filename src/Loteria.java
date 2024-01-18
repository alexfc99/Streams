import java.util.Collections;
import java.util.List;

public class Loteria implements Comparable<Loteria> {
    private int dinero;
    private int premios;

    public Loteria(int dinero, int premios) {
        this.dinero = dinero;
        this.premios = premios;
    }

    public int getDinero() {
        return this.dinero;
    }

    public int getPremios() {return this.premios;}

    public String toString() { return this.dinero + " " + this.premios;}

    @Override
    public int compareTo(Loteria dinero) {
        if (this.dinero == dinero.getDinero()){
            if (this.premios < dinero.premios){
                return -1;
            }else return 1;
        } else if (this.dinero > dinero.getDinero()) {
            return -1;
        } else {
            return 1;
        }

    }
}