
/**
 * Write a description of class W4W2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class W4W2
{
   public static void main(String[] args)
   {
       Scanner obj=new Scanner(System.in);
       System.out.println("Please enter the number:");
       double num=obj.nextFloat();
       if(num%2==0)
       {
           System.out.println("The num is even.");
       }
       else
       {
           System.out.println("The num is odd.");
       }
   }
}