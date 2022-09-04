package pattern5;

import java.util.*;

public class pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows ");
        n = sc.nextInt();
        int i, j;
        for (i = 0; i<n; i++) {
            for (j=n; j>i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}