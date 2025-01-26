package assignment1;

import java.util.Optional;

public class Person {

    private String name;
    private int age;
    private Optional<Dog> dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Optional<Dog> getDog() {
        return dog;
    }

    public void setDog(Optional<Dog> dog) {
        this.dog = dog;
    }

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
