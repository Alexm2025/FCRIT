public class sumOfMultiple
{
    public static void main(String[] args) 
    {
        int result=0;
        int FirstDigit=0;
        int LastDigit=0;
        int sum=0;
        for(int i=1;i<=10;i++)
        {
           result= 8*i;
           FirstDigit=result%10;
           LastDigit=result/10;
           sum=FirstDigit+LastDigit;
           System.out.println(sum);
        }
    }
}