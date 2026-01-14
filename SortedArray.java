public class SortedArray
{
    public static void main(String[] args)
    {
        int arr[]={1,2,4,3};

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                {
                    System.out.println("Not sorted");
                    return;
                }
            
                
            
        }
        System.out.println("Sorted");
    }
}