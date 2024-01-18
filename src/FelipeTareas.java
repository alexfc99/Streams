import java.util.ArrayList;

public class FelipeTareas {
    public static void main(String[] args) {
        ArrayList<TareasFelipe> tareas = new ArrayList<>();
        tareas.add(new TareasFelipe(30, 7));
        tareas.add(new TareasFelipe(30, 2));
        tareas.add(new TareasFelipe(3, 2));
        tareas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}