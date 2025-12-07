
/**
 * Write a description of class W4W3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class W4W3
{
   public static void main(String[] args)
   {
       Scanner obj=new Scanner(System.in);
       System.out.println("Please enter the number:");
       double num=obj.nextFloat();
       if(num>0)
       {
           System.out.println("The number is positive.");
       }
       else if(num<0)
       {
           System.out.println("The number is negative.");
       }
       else
       {
           System.out.println("The number is zero.");
       }
   }
}