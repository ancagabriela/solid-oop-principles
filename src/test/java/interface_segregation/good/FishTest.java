package interface_segregation.good;

import interface_segregation.bad.Fish;
import interface_segregation.bad.SwimmableAnimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FishTest {

    @Test
    public void itShouldSwim() {
        SwimmableAnimal fish =  new Fish();

        String swim = fish.swim();

        assertEquals("the fish is swimming!", swim);
    }
}