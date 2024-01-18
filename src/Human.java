public class Human implements Comparable<Human> {
    private String name;
    private int salary;

    public Human(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.getName() + " - " +  + this.getSalary() + "€";
    }

    @Override
    public int compareTo(Human human) {
        if (this.salary == human.getSalary()) {
            return 0;
        } else if (this.salary > human.getSalary()) {
            return -1;
        } else {
            return 1;
        }
    }
}
