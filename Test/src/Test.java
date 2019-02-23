import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Name1", 34);
        Person person2 = new Person("Name2", 44);

        Map<Person, Integer> persons = new HashMap<>();
        persons.put(person1, 1);
        persons.put(person2, 2);

        System.out.println("compare references ->" + person1.equals(person2));
        System.out.println("person1 -> " + persons.get(person1));
        System.out.println("person2 -> " + persons.get(person2));
        System.out.println("personN -> " + persons.get(new Person("NameN", 45)));
    }
}
