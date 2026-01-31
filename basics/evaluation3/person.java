package evaluation3;

public class person {
    private String name;
    private int age;

    // Constructor without parameters
    public person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name parameter
    public person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with name and age parameters
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Instantiate objects using different constructors
        person person1 = new person(); // Default constructor
        person person2 = new person("John"); // Constructor with name parameter
        person person3 = new person("Alice", 25); // Constructor with name and age parameters

        // Display information
        System.out.println("Person 1: Name = " + person1.getName() + ", Age = " + person1.getAge());
        System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.getAge());
        System.out.println("Person 3: Name = " + person3.getName() + ", Age = " + person3.getAge());
    }
}


