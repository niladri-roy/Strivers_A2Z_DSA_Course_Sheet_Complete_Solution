import java.util.*;

public class pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows ");
        n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}