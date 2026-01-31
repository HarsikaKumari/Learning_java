package errorHandling;
import java.util.*;

public class triangle {
    public double height;
    public double base;

    public triangle(double height, double base) {
        this.base = base;
        this.height = height;
        // System.out.println("The height of the triangle is: " + height + "the height of the base is: " + base);
    }

    public void setHeight(double height) {
        this.height = height;

    }

    public void setBase(double base) {
        this.base = base;

    }
    
    public double getHeight() {
        return height;
    }
    
    public double getBase() {
        return base;
    }
    
    public double calcArea () {
        return 0.5 * height * base;
    }
    
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        
        // tri.setBase(base);
        
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        
        // tri.setHeight(height);
        
        triangle tri = new triangle(height, base);

        double area = tri.calcArea();

        System.out.println("The area of the triangle is: " + area);
    }

}
