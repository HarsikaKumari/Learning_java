import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        
        //find the middle of three numbers
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        if ((p >= q && p <= r) || (p <= q && p >= r)) {
            System.out.println("Middle number is: " + p);
        } else if ((q >= p && q <= r) || (q <= p && q >= r)) {
            System.out.println("Middle number is: " + q);
        } else {
            System.out.println("Middle number is: " + r);
        }

        if(p%5 == 0 && p%3 == 0){
            System.out.println("FizzBuzz");
        }else if(p%5 == 0){
            System.out.println("Fizz");
        }else if(p%3 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(p);
            
        }
    }
    
}
