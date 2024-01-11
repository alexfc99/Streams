import java.util.ArrayList;

public class Problema3 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("Pepe", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Artínez", 1968);
        personas.add(persona);

        personas.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .forEach(person -> System.out.println(person));


    }
}
