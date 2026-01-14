
import java.util.Scanner;

public class PassFail
{
   public static void main(String agrs[])
   {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter phy:");
      float phy=sc.nextFloat();

      System.out.println("Enter chem:");
      float chem=sc.nextFloat();

      System.out.println("Enter math:");
      float math=sc.nextFloat();

      float total=((phy+chem+math)/300)*100;
                if(phy<33||chem<33||math<33)
                {
                        System.out.println("Fail");
                }
                else if(total<40)
                {
                    System.out.println("Fail");
                }
                else
                {
                    System.out.println("Pass");
                }

   }

      }