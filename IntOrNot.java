
import java.util.Scanner;

public class IntOrNot
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your number");

        if(sc.hasNextInt())
        {
            System.out.println("Is Integer");
        }
        else
        {
            System.out.println("Not Integer");
        }


    }
}