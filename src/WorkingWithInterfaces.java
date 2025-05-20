
import java.util.ArrayList;

class Person implements Comparable {
    String first;
    String last;
    int age;

    Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }
    public Integer getAge(){
        return this.age;
    }
    String getFullName() {
        return String.format("%s, %s", last, first);
    }

    public int compareTo(Object o) {
        Person other = (Person) o;
        return this.getAge().compareTo(other.getAge());
    }

    public String toString() {
        return String.format("%s, %s (%d)", last, first, age);
    }
}

public class WorkingWithInterfaces {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Peter", "Parker", 22));
        list.add(new Person("Gwen", "Stacie", 23));
        list.add(new Person("Mary", "Jane",24));
        list.add(new Person("Amy", "Adams",11));
        list.add(new Person("Sam", "Adams",22));
        list.add(new Person("Carey", "Adams",99));

        list.sort(null);
        for (Person p : list) {
            System.out.println(p);
        }
    }
}
