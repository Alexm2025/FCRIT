
import java.util.Scanner;

public class DoubleTripple
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter text:");
        String str=sc.nextLine();

        if(str.contains("   "))
        {
            System.out.println("Has Triple space");
        }
        else if(str.contains("  "))
        {
            System.out.println("Has double space");
        }
        else
        {
            System.out.println("Other");
        }
    }
}