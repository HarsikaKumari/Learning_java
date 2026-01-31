package errorHandling;

public class throwFinally {
    public static void main(String[] args) {
        
    int a = 10;
    int b = 0;
    // int c = a/b;
 
    try {
        System.out.println("Part before error!");
        int c = a / b; 
        System.out.println("Part after error!" + c);
    } catch (ArithmeticException e) {
        System.out.println("Arithmetic error occurred!" );
    } finally {
        System.out.println("Finally block printed!");
    }
  }    
}

