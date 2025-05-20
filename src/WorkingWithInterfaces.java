import java.util.ArrayList;

class Person implements Comparable{
    String first;
    String last;
    Person(String first, String last){
        this.first = first;
        this.last = last;
    }
    String getFullName(){
        return String.format("%s,%s", last, first);
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return getFullName().compareTo(p.getFullName());
    }

    @Override
    public String toString() {
        return this.last + ", " + this.first;
    }
}

public class WorkingWithInterfaces {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Nat", "Tessema"));
        list.add(new Person("Gwen", "Stacie"));
        list.add(new Person("Mary", "Jane"));
        list.add(new Person("Parker", "Peter"));
        list.add(new Person("Mary", "Johnson"));


        list.sort(null);

        for (Person p : list){
            System.out.println(p);
        }
    }
}
