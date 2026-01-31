package evaluation3;

// Main class
public class question3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        // object
        System.out.println("Area of the circle: " + circle.area());
    }
}

interface shape {
    int area();
}

interface rectangle extends shape {
    int l = 5;
    int b = 5;

    default int area() {
        return l * b;
    }
}

class Circle implements shape {
    int radius = 5;

    public int area() {
        return 3 * radius * radius;
    }
}

