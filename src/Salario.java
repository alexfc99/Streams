import java.util.ArrayList;

public class Salario {
    public static void main(String[] args) {
        ArrayList<Human> workers = new ArrayList<>();
        workers.add(new Human("Alfredo", 2000));
        workers.add(new Human("Paula", 1300));
        workers.add(new Human("Jose", 1700));

        workers.stream()
                .sorted()
                .forEach(worker -> System.out.println(worker));
    }
}
