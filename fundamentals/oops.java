public class oops {
    public static void main(String args[]) {
        // Loops
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        int abc = 23523;
        int rev = 0;
        int temp = abc;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println(rev);

        int n = 5;
        int fact = 1;
        do {
            fact *= n;
            n--;
        } while (n > 0);
        System.out.println(fact);

        // Arrays
        int arr[] = { 34, 53, 3, 53, 33, 98, 65 };
        int max = 0;
        int next_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                next_max = max;
                max = arr[i];
            } else if (arr[i] > next_max && arr[i] != max) {
                next_max = arr[i];
            }
        }
        System.out.println(next_max);

        int arr1[] = { 23, 45, 12, 67, 34, 89, 90 };
        int k = 3;
        while (k > 0) {
            int tem = arr1[arr1.length - 1];
            for (int i = arr1.length - 1; i > 0; i--) {
                arr1[i] = arr1[i - 1];
            }
            arr1[0] = tem;
            k--;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        int palin[] = { 1, 2, 3, 2, 1 };
        int last = palin.length - 1;
        boolean flag = false;
        
        for (int i = 0; i < last / 2; i++) {
            if (palin[i] == palin[last - i]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
