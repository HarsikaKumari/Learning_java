package inheritance;

interface girl {
    void printGirl();
}

interface boy {
    void printBoy();
}

class student implements girl, boy {
    public void printGirl() {
        System.out.println("Interface girl");
    }

    public void printBoy() {
        System.out.println("Interface boy");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        student std = new student();
        std.printGirl();
        std.printBoy();
    }
}
