public class TareasFelipe implements Comparable<TareasFelipe> {
    private int prioridad;
    private int tiempo;

    public TareasFelipe(int prioridad, int tiempo) {
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getTiempo() {
        return this.tiempo;
    }

    @Override
    public String toString() {
        return this.prioridad + " " + this.tiempo;
    }

    @Override
    public int compareTo(TareasFelipe prioridad) {
        if (this.prioridad == prioridad.getPrioridad()){
            if (this.tiempo < prioridad.tiempo){
                return -1;
            }else return 1;
        } else if (this.prioridad > prioridad.getPrioridad()) {
            return -1;
        } else {
            return 1;
        }

    }
}