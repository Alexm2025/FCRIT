
import java.util.Scanner;

public class ReplaceUnderscore
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter text:");
        String str=sc.nextLine();

        System.out.println(str.replace(" ","_"));
    }
}