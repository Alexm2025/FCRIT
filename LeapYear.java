
import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter url:");
        String str=sc.nextLine();

        if(str.contains(".com"))
        {
           System.out.println("Commercial website");
        }
        else if(str.contains(".org"))
        {
            System.out.println("Organization website");
        }
        else if(str.contains(".in"))
        {
            System.out.println("Indian Website");
        }
        else
        {
            System.out.println("Invalid Website");
        }

    }
}