
import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;


public class TutankamonCalculo {
    public static void main(String[] args) {
        ArrayList<Tutankamon> salida = new ArrayList<>();
        salida.add(new Tutankamon("flecha", 5, 1));
        salida.add(new Tutankamon("sandalias", 10, 2));
        salida.add(new Tutankamon("sarcofago", 1000, 1000));
        salida.add(new Tutankamon("mascara", 1000, 10));
        salida.add(new Tutankamon("arco", 10, 2));

        salida.stream()
                .sorted()
                .forEach(System.out::println);

    }
}