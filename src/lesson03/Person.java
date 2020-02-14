package lesson03;

public class Person {

    static String firstName;
    String secondName;
    int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person(  "Ivan",  "Ivanov",  15);
        Person p2 = new Person(  "Ivan",  "Ivanov",  15);
        Person p3 = p1;

        System.out.printf ("p1 == p2 is %s%n", p1 == p2);
        System.out.printf("p1.equals (p2) is %s%n", p1.equals(p2));
        System.out.printf("p1 == p3 is %s%n", p1 == p3);

        System.out.println(p1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return secondName != null ? secondName.equals(person.secondName) : person.secondName == null;
    }

    @Override
    public int hashCode() {
        int result = secondName != null ? secondName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

