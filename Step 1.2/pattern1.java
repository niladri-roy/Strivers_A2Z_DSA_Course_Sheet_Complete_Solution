import java.util.*;

public class pattern1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows ");
        n = sc.nextInt();
        int i,j;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}