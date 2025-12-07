
/**
 * Write a description of class W4W6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class W4W6
{
    public static void main(String[] args)
    {
        Scanner MP=new Scanner(System.in);
        System.out.println("Please enter the MP:");
        double mp=MP.nextFloat();
        double dispA=0.6;
        double dispB=0.4;
        double dispC=0.2;
        double dispD=0.1;
        
        Scanner CHAR=new Scanner(System.in);
        System.out.println("Please enter the category:");
        String cate1=CHAR.next();
        char category=cate1.charAt(0);
        if(category=='A')
        {
            double sp=mp-(mp*dispA);
            System.out.println("The selling price of category A is:"+sp);
        }
        else if(category=='B')
        {
            double sp=mp-(mp*dispB);
            System.out.println("The selling price of category B is:"+sp);
        }
        else if(category=='C')
        {
            double sp=mp-(mp*dispC);
            System.out.println("The selling price of category C is:"+sp);
        }
        else if(category=='D')
        {
            double sp=mp-(mp*dispD);
            System.out.println("The selling price of category D is:"+sp);
        }
        else
        {
        System.out.println("Not available.");
        }
    }
}