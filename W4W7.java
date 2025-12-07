
/**
 * Write a description of class W4W7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class W4W7
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
        
        Scanner category=new Scanner(System.in);
        System.out.println("Please enter the category");
        String cate=category.next();
        char Category1= cate.charAt(0);
        switch(Category1)
        {
           case 'A':
               double sp1=mp-(mp*dispA);
            System.out.println("The selling price of category A is:"+sp1);
            break;
            case 'B':
                double sp2=mp-(mp*dispB);
            System.out.println("The selling price of category B is:"+sp2);
            break;
            case 'C':
                double sp3=mp-(mp*dispC);
            System.out.println("The selling price of category C is:"+sp3);
            break;
            case 'D':
                double sp=mp-(mp*dispD);
            System.out.println("The selling price of category D is:"+sp);
            break;
            default:System.out.println("Not available.");
        }
    }
}