import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Priyanka on 11/26/2015.
 */
public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Enter no. of lines-");

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }



    }
}