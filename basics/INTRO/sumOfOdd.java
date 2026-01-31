import java.util.*;

public class sumOfOdd {
    // method to find the sum of all the odd numbers from 1 to n;
    public static void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all the odd number between 1 and " + n + " is: " + sum);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sum(n);
    }
}