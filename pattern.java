import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pattern 1
        int n = sc.nextInt();

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //pattern2
        // int n = 4;
        // int m = n + 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i==1 || j==1 || i == n || j == m) {
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //pattern3
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //patern4
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //patern5
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    

        //patern6
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //patern7
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //patern8
        // int count =1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        //patern9
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if ((i+j)%2==0) {
        //             System.out.print("1 ");
        //         } else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //patern10
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("* ");
        //     }
            
        //     System.out.println();
        // }

        // //pattern11
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //pattern12

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((i-j+1)+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
