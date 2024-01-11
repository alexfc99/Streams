import java.util.ArrayList;
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cadenas = new ArrayList<>();
        System.out.println("Introduce varias palabras (línea en blanco para acabar):");
        String cadena;
        while(scanner.hasNextLine()) {
            cadena = scanner.nextLine();
            cadenas.add(cadena);
            if (cadena.isBlank()){
                break;
            }
        }
        cadenas.stream()
                .forEach(c -> System.out.println(c));
    }
}

