// Updated Pet.java
public class Pet {
    // Private data members
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        setName("Unknown");
        setType("Animal");
        setAge(1); // Default age
    }

    // Custom constructor
    public Pet(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    // Mutator (set) method for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor (get) method for name
    public String getName() {
        return name;
    }

    // Mutator (set) method for type
    public void setType(String type) {
        this.type = type;
    }

    // Accessor (get) method for type
    public String getType() {
        return type;
    }

    // Mutator (set) method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 1; // Default age if invalid
        }
    }

    // Accessor (get) method for age
    public int getAge() {
        return age;
    }

    // Custom method to let the pet "speak"
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Default sound";
        }
    }

    // toString method to return object state as a string
    @Override
    public String toString() {
        String info = "Pet Information:\n";
        info += "Type: " + getType() + "\n";
        info += "Name: " + getName() + "\n";
        info += "Sound: " + speak() + "\n";
        info += "Age: " + getAge() + "\n";
        return info;
    }
}

// Runner.java
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Second Pet object using custom constructor
        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println(pet2);

        // Third Pet object using user input
        System.out.println("Enter animal type:");
        String type = scanner.nextLine();
        System.out.println("Enter animal name:");
        String name = scanner.nextLine();
        System.out.println("Enter animal age:");
        int age = scanner.nextInt();

        Pet pet3 = new Pet(name, type, age);
        System.out.println(pet3);

        scanner.close();
    }
}
