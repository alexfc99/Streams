

public class Tutankamon implements Comparable<Tutankamon> {
    private String nombre;
    private int cantidad;
    private int peso;

    public Tutankamon(String nombre, int cantidad, int peso) {
        this.cantidad = cantidad;
        this.peso = peso;
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public int getPeso() {return this.peso;}


    public String toString() { return this.nombre;}

    @Override
    public int compareTo(Tutankamon otro) {
        if (this.cantidad == otro.getCantidad()){
            if (this.peso < otro.peso){
                return -1;
            }else return 1;
        } else if (this.cantidad > otro.getCantidad()) {
            return -1;
        } else {
            return 1;
        }
    }
}
