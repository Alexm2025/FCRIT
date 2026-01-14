import java.util.*;
public class Percentage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter phy marks");
        float phy=sc.nextFloat();

        System.out.println("Enter chem marks");
         float chem=sc.nextFloat();

        System.out.println("Enter math marks");
         float math=sc.nextFloat();

        System.out.println("Enter bio marks");
         float bio=sc.nextFloat();

        System.out.println("Enter english marks");
         float eng=sc.nextFloat();


        float percent=((phy+chem+math+bio+eng)/500)*100;

        System.out.println("Your percentage is :"+percent);
    }
}