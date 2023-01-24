package interface_segregation.good;

import interface_segregation.bad.Animal;
import interface_segregation.bad.Cat;
import interface_segregation.bad.WalkableAnimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    @Test
    public void itShouldWalk() {
        WalkableAnimal cat =  new Cat();

        String walk = cat.walk();

        assertEquals("the cat is walking!", walk);
    }

    @Test
    public void itShouldMeow() {
        Animal cat =  new Cat();

        cat.meow();
    }

}