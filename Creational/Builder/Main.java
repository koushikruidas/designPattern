package Pattern.Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.Builder().setAge(12).build();
        System.out.println(person.getAge());
    }
}
