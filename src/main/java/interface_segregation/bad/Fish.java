package interface_segregation.bad;

public class Fish implements SwimmableAnimal {
    @Override
    public String nameOfAnimal() {
        return "fish";
    }

    @Override
    public String swim() {
        return "the " + nameOfAnimal() + " is swimming!";
    }

    @Override
    public String bark() {
        return null;
    }

    @Override
    public String quack() {
        return null;
    }

    @Override
    public String meow() {
        return null;
    }
}
