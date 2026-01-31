
public class constructorOverloading {
    // instance variables of the class
    int id;
    String name;

    constructorOverloading() {
        System.out.println("this a default constructor");
    }

    constructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        // object creation
        constructorOverloading s = new constructorOverloading();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : " + s.id + "\nStudent Name : " + s.name);

        System.out.println("\nParameterized Constructor values: \n");
        constructorOverloading student = new constructorOverloading(10, "David");
        System.out.println("Student Id : " + student.id + "\nStudent Name : " + student.name);
    }
}