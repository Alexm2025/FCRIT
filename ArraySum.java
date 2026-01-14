public class ArraySum
{
    public static void main(String[] args) 
    {
        float arr[]={1.2f,35.6f,98.5f,4.0f,6.9f};
        float sum=0;

        for(int i=0;i<arr.length;i++)
        {
            float j=arr[i];
            sum+=j;
           
        }
        System.out.println(sum);
    }
}