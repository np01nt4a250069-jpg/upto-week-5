
/**
 * Write a description of class W5W8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W5W8
{
    public static void main(String[] args)
    {
        int n=1;
        do
        {
            double sqrtValue=Math.sqrt(n);
            System.out.println("Square root of " +n+ "is:" +sqrtValue);
            n++;
        }
        while(n<=10);
    }
}