import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Illiterate {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("/media/alu10472056/T7/illiterate.csv"));
        ArrayList<Analfabeto> analfabetos = new ArrayList<>();
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] dividir = line.split(",");
            String pais = dividir[5];
            String analfabeto = dividir[8];
            analfabetos.add( new Analfabeto(pais, Integer.parseInt(analfabeto)));
        }
        reader.close();
        analfabetos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
