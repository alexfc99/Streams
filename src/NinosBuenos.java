public class NinosBuenos implements Comparable<NinosBuenos> {
    private int ninos;
    private int regalos;

    public NinosBuenos(int ninos, int regalos) {
        this.ninos = ninos;
        this.regalos = regalos;
    }

    public int getNinos() {
        return this.ninos;
    }

    public int getRegalos() {
        return this.regalos;
    }

    @Override
    public String toString() {
        return this.ninos + " " + this.regalos;
    }

    @Override
    public int compareTo(NinosBuenos ninos) {
        if (this.ninos == ninos.getNinos()){
            if (this.regalos < ninos.regalos){
                return -1;
            }else return 1;
        } else if (this.ninos > ninos.getNinos()) {
            return -1;
        } else {
            return 1;
        }

    }
}
