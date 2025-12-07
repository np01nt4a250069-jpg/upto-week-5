
/**
 * Write a description of class W4W1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class W4W1
{
    public static void main(String[] args)
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("Please enter the marks:");
       double marks=obj.nextFloat();
       if(marks>=40 && marks<=100)
       {
           System.out.println("You have passes the exam.");
       }
       else
       {
         System.out.println("You have failed the exam.");  
       }
    }
}