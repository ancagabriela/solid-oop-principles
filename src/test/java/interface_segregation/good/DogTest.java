package interface_segregation.good;

import interface_segregation.bad.Dog;
import interface_segregation.bad.WalkableAnimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @Test
    public void itShouldWalk() {
        WalkableAnimal dog =  new Dog();

        String walk = dog.walk();

        assertEquals("the dog is walking!", walk);
    }
}