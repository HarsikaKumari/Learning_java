
// solid rectaangle:-
// import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
//       int n = 4;
//       int m = 5;
      
//       for (int i = 1; i <= n ; i++ ) {
//         for (int j = 1; j <= m; j++){
//           System.out.print("*");
//         }
//         System.out.println(" ");
//       }
//   }
// }

// hollow rectaangle:-
// import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
//       int n = 4;
//       int m = 5;
      
//       for (int i = 1; i <= n ; i++) {
//         for (int j = 1; j <= m; j++) {
//           if (i==1 || j==1 || i==n || j==m){
//             System.out.print("*");
//           } else {
//             System.out.print(" ");
//           }
//         }
//         System.out.println("");
//       }
//   }
// }

// // half pyramid pattern:-
// import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
//       int n = 4;

//       for (int i = 1; i <= n ; i++ ) {
//         for (int j = 1; j <= i; j++){
//           System.out.print("*");
//         }
//         System.out.println(" ");
//       }
//   }
// }

// // half inverted pyramid pattern:-
// import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
//       int n = 4;
      
//       for (int i = n; i >= 1 ; i-- ) {
//         for (int j = 1; j <= i; j++){
//           System.out.print("*");
//         }
//         System.out.println(" ");
//       }
//   }
// }

// // half pyramid pattern rotated at 180 deg:-
// import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
//       int n = 4;
      
//       for (int i = 1; i <= n ; i++ ) {
//         for (int j = 1; j <= n-i; j++){
//           System.out.print(" ");
//         }
//         for (int j=1; j <= i ; j++){
//           System.out.print("*");
//         } 
//         System.out.println();
//       }
//   }
// }

// // half pyramid with numbers pattern:-
// import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// inverted half
// pyramid with
// numbers pattern:
// -
// import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// // floyd's triangle patterns:-
// import java.util.*;

// public class patterns {
//     public static void main(String[] args) {
//       int n = 5;
//       int num = 1;
      
//       for (int i = 1; i <= n; i++) {
//         for (int j = 1; j<= i; j++) {
//           System.out.print(num + " ");
//           num++;
//         } 
//         System.out.println();
//       }
//   }
// }

// floyd's 0-1 triangle patterns:-
import java.util.*;

public class patterns {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
