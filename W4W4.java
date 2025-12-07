
/**
 * Write a description of class W4W4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class W4W4
{
   public static void main(String[] args)
   {
       Scanner obj=new Scanner(System.in);
       System.out.println("Please enter the number:");
       double num=obj.nextFloat();
       if(num%3==0 && num%5==0)
       {
           System.out.println("The number is divisible by 3 and 5.");
       }
       else
       {
           System.out.println("The number is not divisible by 3 and 5.");
       }
   }
}