import java.util.Scanner;

public class RectangleOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get length and width from the user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate and display the area
        double area = calculateRectangleArea(length, width);
        System.out.println("The area of the rectangle is: " + area);

        // Calculate and display the perimeter
        double perimeter = calculateRectanglePerimeter(length, width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the perimeter of a rectangle
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
