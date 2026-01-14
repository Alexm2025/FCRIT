public class factorial
{
    public static void main(String[] args)
    {
        int i=1;
        int fact=1;
       int result=0;

        while(i<5)
        {
            fact=fact*i;
             result=5*fact;
            i++;
        }
        System.out.println(result);

    }
}