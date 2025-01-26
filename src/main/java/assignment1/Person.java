package assignment1;

import java.util.Optional;

public class Person {
    private String name;
    private int age;
    private Optional<Dog> dog;

    public Person(String name, int age) {
        // Call the constructor below with null value for dog
        this(name, age, null);
    }

    public Person(String name, int age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.of(dog);
    }
}
