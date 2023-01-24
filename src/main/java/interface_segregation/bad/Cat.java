package interface_segregation.bad;

public class Cat implements Animal, WalkableAnimal {
    @Override
    public String nameOfAnimal() {
        return "cat";
    }

    @Override
    public String walk() {
        return "the " + nameOfAnimal() + " is walking!";
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
        return "meow!";
    }
}
