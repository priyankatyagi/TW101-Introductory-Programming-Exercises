import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Priyanka on 11/27/2015.
 */
class Primefactors
{
    public ArrayList<Integer> generate(int n)
    {

        ArrayList<Integer> factors=new ArrayList<Integer>();
        for(int i=1;i<=n;i++) {

            if(n%i==0)
            {
                factors.add(i);
            }
        }
        return factors;

    }

}
public class Display {
    public static void main(String[] args) {
        Primefactors pf = new Primefactors();
        System.out.println("Enter a number-");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> factors = new ArrayList<Integer>();
        factors = pf.generate(n);
        for (int i = 0; i < factors.size(); i++) {
            int value = factors.get(i);
            System.out.println(value);
        }

    }
}
