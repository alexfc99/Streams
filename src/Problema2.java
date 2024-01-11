import java.util.ArrayList;

public class Problema2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Artínez", 1968);
        personas.add(persona);

        long count = personas.stream()
                .filter(person -> person.getLastName().startsWith("A"))
                .count();

        System.out.println("Las personas que su apellido empiezan por A son: " + count);

    }
}
