package lesson03;

public class PersonWithGender {

    String firstName, secondName;
    int age;
    Gender gender;

    public PersonWithGender(String firstName, String secondName, int age, Gender gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        PersonWithGender p1 = new PersonWithGender("Ivan", "Ivanov",15, Gender.MALE);
        System.out.println(p1);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonWithGender that = (PersonWithGender) o;

        if (age != that.age) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        return gender == that.gender;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
