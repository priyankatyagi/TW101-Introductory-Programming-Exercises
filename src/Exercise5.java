import java.util.Scanner;

/**
 * Created by Priyanka on 11/27/2015.
 */
public class Exercise5 {
    public static void main(String[] args) {
        System.out.print("Enter no. of lines-");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++)
        {
            for (int k=0; k<n-i; k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
