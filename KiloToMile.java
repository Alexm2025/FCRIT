
import java.util.Scanner;

public class KiloToMile
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter kilometers:");
        float kilo=sc.nextFloat();

        float miles=0.62f*kilo;

        System.out.println("Miles :"+miles);
    }
}