
    // Interface for a shape
interface Shape {
    double getArea();
}

// Interface for a 3D shape, extends Shape
interface ThreeDimensionalShape extends Shape {
    double getVolume();
}

// Implementing classes
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Sphere implements ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Shapes  {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.getArea());

        Sphere sphere = new Sphere(5);
        System.out.println("Surface area of sphere: " + sphere.getArea());
        System.out.println("Volume of sphere: " + sphere.getVolume());
    }
}
