public class Pet {
    // Private data member
    private String name;

    // Default constructor
    public Pet() {
        setName("Unknown"); // Setting default name using setter
    }

    // Mutator (set) method for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor (get) method for name
    public String getName() {
        return name;
    }

    // toString method to return object state as a string
    @Override
    public String toString() {
        return "Pet Name: " + name;
    }

    // Main method to test the Pet class
    public static void main(String[] args) {
        // First Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString()); // Should print "Pet Name: Unknown"

        // Second Pet object using set method
        Pet pet2 = new Pet();
        pet2.setName("Buddy");
        System.out.println(pet2.toString()); // Should print "Pet Name: Buddy"
    }
}
