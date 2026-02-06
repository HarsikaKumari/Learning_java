public class oops {
    
    public static int count = 0;
    public oops() {
        count++;
        System.out.println("This is a constructor");
    }

    public oops(int a) {
        System.out.println("This is a parameterized constructor with value: " + a);
    }

    public oops(int a, int b) {
        count++;
        System.out.println("overloading " + (a + b));
    }

    public static void main(String[] args) {
        oops obj1 = new oops();
        oops obj2 = new oops(5);
        oops obj3 = new oops(3, 7);
        System.out.println("Number of objects created: " + obj3.count);
    }
}
