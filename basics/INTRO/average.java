import java.util.*;

public class average {
  // Method to find average of three numbers:-
  public static int printAverage(int firstNum, int secondNum, int thirdNum){
    int totalNumber = 3;
    return (firstNum + secondNum + thirdNum)/totalNumber;
  }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int firstNum = scan.nextInt();
      int secondNum = scan.nextInt();
      int thirdNum = scan.nextInt();
    System.out.println("The average of the three numbers is: " +  printAverage(firstNum, secondNum, thirdNum) );
  }
}