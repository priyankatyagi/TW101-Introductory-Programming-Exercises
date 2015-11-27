/**
 * Created by Priyanka on 11/27/2015.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if((i%3)==0&&(i%5)==0)
            {
                System.out.println("FizzBuzz\r\n");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz\r\n");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz\r\n");
            }
            else
            {
                System.out.print(i+"\r\n");

            }
        }
    }
}
