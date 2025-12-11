import java.util.ArrayList;
import java.util.List;

// Abstraction (contract):
// Inside an interface, we only have methods.
interface Animal {
    void talk();
}

// Encapsulation.
//
// Abstraction:
// This class is an Animal, but it doesn't implement "talk" method yet.
// So it needs to be an abstract class.
abstract class NamedAnimal implements Animal {
    // Properties
    private final String name;

    public NamedAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Inheritance:
// Code reuse
class Cat extends NamedAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Meow, my name is " + getName());
    }
}

// Inheritance:
// Code reuse
class Dog extends NamedAnimal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("Woof, my name is " + getName());
    }
}

public class Animals {
    public static void main(String[] args) {
        // We can only create "new" instances from concrete classes
        Animal a1 = new Cat("Kitty"); // Cat a1 = new Cat("Kitty");
        Animal a2 = new Dog("Pluto"); // Dog a2 = new Dog("Pluto");

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);

        printAnimals(animals);
    }

    private static void printAnimals(List<Animal> animals) {
        // Polymorphism:
        // Loop through the items in the collection of Animal
        // and call "talk".
        for (Animal a : animals) {
            // Depending on the concrete class of the item,
            // the behaviour will be different.
            a.talk();
        }
    }
}
