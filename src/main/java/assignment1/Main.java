package assignment1;

public class Main {
    public static void main(String[] args) {
        // Person with a dog
        Dog dog = new Dog("Max", 5);
        Person person1 = new Person("Mousam", 25, dog);
        try {
            person1.changeDogsName("Rocky");
            System.out.println("Dog's name successfully changed to: " + person1.getDog().get().getName());
        } catch (RuntimeException e) {
            System.out.println("Unable to change dogs name: " + e.getMessage());
        }

        // Person without a dog
        Person person2 = new Person("John", 30);
        try {
            person2.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dogs name: " + e.getMessage());
        }

    }
}