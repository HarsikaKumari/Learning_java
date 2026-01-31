// package evaluation4;

// public class question3 {
//     public static void main(String[] args) {
//         try {
//             throw new Exception("This is a custom exception!");
//         } catch (Exception e) {
//             System.out.println("Custom exception caught: " + e.getMessage());
//         }
//     }
// }

// Q.3 crete user defined exception shoe use of throw/finally keyword.

package evaluation4;

// user defined exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class question3 {
    public static void main(String[] args) {
        try {
            // Throw the user-defined exception
            throw new CustomException("This is a custom exception!");
        } catch (CustomException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
}
