// PersonTest.java
package assignment1Test;

import assignment1.Dog;
import assignment1.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testPersonCreationWithDog() {
        Dog dog = new Dog("cat", 12);
        Person nirmal = new Person("Nirmal", 30, dog);
        assertEquals("Nirmal", nirmal.getName());
        assertEquals(30, nirmal.getAge());
        assertTrue(nirmal.getDog().isPresent());
        assertEquals(dog, nirmal.getDog().get());
    }

    @Test
    void testPersonCreationWithoutDog() {
        Person nirmal = new Person("Nirmal", 25);
        assertEquals("Nirmal", nirmal.getName());
        assertEquals(25, nirmal.getAge());
        assertFalse(nirmal.getDog().isPresent());
    }

    @Test
    void testHasOldDogTrue() {
        Dog dog = new Dog("Rover", 12);
        Person nirmal = new Person("Nirmal", 25, dog);
        assertTrue(nirmal.hasOldDog());
    }

    @Test
    void testHasOldDogFalse() {
        Dog dog = new Dog("Max", 8);
        Person nirmal = new Person("Nirmal", 35, dog);
        assertFalse(nirmal.hasOldDog());
    }

    @Test
    void testHasOldDogNoDog() {
        Person nirmal = new Person("Nirmal", 28); // No dog
        assertFalse(nirmal.hasOldDog());
    }

    @Test
    void testChangeDogsName() {
        Dog dog = new Dog("Buddy", 6);
        Person nirmal = new Person("Nirmal", 50, dog);
        nirmal.changeDogsName("Charlie");
        assertEquals("Charlie", nirmal.getDog().get().getName());
    }

    @Test
    void testChangeDogsNameNoDog() {
        Person nirmal = new Person("Nirmal", 45);  //No Dog
        assertThrows(RuntimeException.class, () -> nirmal.changeDogsName("Max"));


    }

    @Test
    void testPersonEquals() {
        Dog dog1 = new Dog("Buddy", 3);
        Person person1 = new Person("Nirmal", 30, dog1);
        Person person2 = new Person("Nirmal", 30, dog1);
        Person person3 = new Person("Bob", 25);

        assertEquals(person1, person2);
        assertNotEquals(person1, person3);
    }


}