
import java.util.Scanner;

public class Tax
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your salary");
        int sal=sc.nextInt();

        if(sal>100000)
        {
            System.out.println("Tax:30%");
        }
        else if(sal>500000)
        {
            System.out.println("Tax:20%");
        }
        else if(sal>250000)
        {
            System.out.println("Tax: 5%");
        }
        else
        {
            System.out.println("No Tax");
        }
        
       

    }
}