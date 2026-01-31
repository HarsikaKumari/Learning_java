public class interfaceExtend {
    public static void main (String[] args) {
        Rectangle r = new Rectangle(20, 4);
        r.draw();
        System.out.println("Area of Rectangle = " + r.calculateArea());
    }

    interface Draw {
        void draw();
    }

    interface Circle extends Draw {
        double calculateArea();
    }

    static class Rectangle implements Circle {
        double a;
        double b;
        Rectangle (double a, double b) {
            this.a = a;
            this.b = b;
        }
        public void draw() {
            System.out.println("It is a Rectangle!!");
        }
        public double calculateArea () {
            return a*b;
        }
    }
}
