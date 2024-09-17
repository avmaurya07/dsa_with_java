import java.util.*;

public class one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(i);
        // }
        // int i =0;
        // while (i<11) {
        //     System.out.println(i);
        //     i++;
        // }
        

        // int n = sc.nextInt();

        // int sum = 0;
        // for (int i = 0; i <= n; i++) {
        //     sum +=i;
        // }
        // System.out.println(sum);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                n + " X " + i +" = " + n*i
            );
        }
    }
}