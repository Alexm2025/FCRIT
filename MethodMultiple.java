

public class MethodMultiple
{
    void multi(int n)
    {
            int i=0;
            
            while(i<=10)
            {
                System.out.println(n*i);
                i++;
            }
            
    }
    public static void main(String[] args) 
    {
        MethodMultiple obj = new MethodMultiple();
        
        obj.multi(5);
       
        
    }
}