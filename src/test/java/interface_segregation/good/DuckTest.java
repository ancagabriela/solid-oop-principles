package interface_segregation.good;

import interface_segregation.bad.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckTest {

    @Test
    public void itShouldWalk() {
        WalkableAnimal duck =  new Duck();

        String walk = duck.walk();

        assertEquals("the duck is walking!", walk);
    }

    @Test
    public void itShouldFly() {
        FlyableAnimal duck =  new Duck();

        String fly = duck.fly();

        assertEquals("the duck is flying!", fly);
    }

    @Test
    public void itShouldSwim() {
        SwimmableAnimal duck =  new Duck();

        String swim = duck.swim();

        assertEquals("the duck is swimming!", swim);
    }
}