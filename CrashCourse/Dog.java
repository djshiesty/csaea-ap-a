package Dog

public class Dog {

    // Data / attributes
    String name;
    String breed;
    String ownerName;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel = 100;

    //Constructor

    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        age = 5;
        weight = 35;
        isHungry = true;
        isHome = false;
    }
    
    // Behaviors

    public void eat() {
        isHungry = false;
        weight += 5;
    }

    public void bark() {
        System.out.println("Woof woof!");
    }

    public void comehome() {
        isHome = true;
    }

    public void scratch() {
        System.out.println("I'm Making a mess");
    }
    public void bite() {
        System.out.println("I'm changing nothing!");
    }

    public void runaway() {
        isHome = false;
        energyLevel -= 20;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    }
    
    public void sleep() {
        energyLevel += 20;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    }

    public void birthday() {
        age++;
    }
}