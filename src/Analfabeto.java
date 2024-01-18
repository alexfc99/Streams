public class Analfabeto implements Comparable<Analfabeto> {
    private String pais;
    private int analfabeto;

    public Analfabeto(String pais, int analfabeto) {
        this.pais = pais;
        this.analfabeto = analfabeto;
    }

    public String getPais() {
        return this.pais;
    }

    public int getAnalfabeto() {
        return this.analfabeto;
    }

    @Override
    public String toString() {
        return this.getPais() + " - " +  + this.getAnalfabeto();
    }

    @Override
    public int compareTo(Analfabeto analfabeto) {
        if (this.analfabeto == analfabeto.getAnalfabeto()) {
            return 0;
        } else if (this.analfabeto > analfabeto.getAnalfabeto()) {
            return -1;
        } else {
            return 1;
        }
    }
}
