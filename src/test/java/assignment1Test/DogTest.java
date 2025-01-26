// DogTest.java
package assignment1Test;

import assignment1.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    void testDogCreation() {
        Dog dog = new Dog("Mousam", 25);
        assertEquals("Mousam", dog.getName());
        assertEquals(25, dog.getAge());
    }

    @Test
    void testDogEquals() {
        Dog dog1 = new Dog("Chip", 3);
        Dog dog2 = new Dog("Chip", 3);
        Dog dog3 = new Dog("Mousam", 7);

        assertEquals(dog1, dog2);
        assertNotEquals(dog1, dog3);
    }

}