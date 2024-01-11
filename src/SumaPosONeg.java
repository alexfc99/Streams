import java.util.ArrayList;
import java.util.List;

public class SumaPosONeg {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(-66);
        numeros.add(34);
        numeros.add(-5);

        long positivos = numeros.stream()
                .filter(number -> number > 0)
                .count();
        long negativos = numeros.stream()
                .filter(number -> number < 0)
                .count();

        int suma = numeros.stream()
                        .mapToInt(Integer::valueOf)
                        .sum();

        System.out.println("Hay " + positivos + " números positivos, " + negativos + " números negativos" + " y la suma de los números es igual a " + suma );
    }
}
