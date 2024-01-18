import java.util.ArrayList;

public class NinosBuenosCalculo {
    public static void main(String[] args) {
        ArrayList<NinosBuenos> ninos = new ArrayList<>();
        ninos.add(new NinosBuenos(80, 2));
        ninos.add(new NinosBuenos(100, 12));
        ninos.add(new NinosBuenos(100, 1));
        ninos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
