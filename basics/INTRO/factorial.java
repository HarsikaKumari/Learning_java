import java.util.*;

public class factorial {
  // Method to find factorial:-
  public static void printFactorial(int num){
    if (num < 0){
      System.out.println("Invalid input.");
      return;
    } 
    int factorial = 1;
    
    for (int i = num; i >= 1; i--){
      factorial = factorial * i;
    }
      System.out.println("The factorial of the Number is: " + factorial);
  }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      printFactorial(num);
  }
}
