
import java.util.Scanner;

public class ToLowerCase
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter text:");
        String str=sc.nextLine();

        System.out.println(str.toLowerCase());
    }
}