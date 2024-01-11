import java.util.ArrayList;
import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Introduce varias números (número en negativo para acabar):");
        int numero;
        while(scanner.hasNextLine()) {
            numero = scanner.nextInt();
            numeros.add(numero);
            if (numero < 0){
                break;
            }
        }
        numeros.stream()
                .filter(x -> x > 1 && x < 5)
                .forEach(c -> System.out.println(c));
    }
}
