import java.util.Scanner;

/**
 * Created by Priyanka on 11/27/2015.
 */
public class Exercise6 {
    public static void main(String[] args) {
        System.out.print("Enter no. of lines-");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int k = 1; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();
    }
}
