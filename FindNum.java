public class FindNum
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3};

        for(int i=0;i<=arr.length;i++)
        {
            if(arr[i]==1)
            {
                System.out.println("Found");
                return;
            }
            else
            {
                System.out.println("Not found");
            }
         
        }
       
        
    }
}