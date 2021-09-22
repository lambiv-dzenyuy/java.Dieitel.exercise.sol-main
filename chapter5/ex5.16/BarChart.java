//Bar chart printing program
public class BarChart 
{
    public static void main(String[] args) 
    {
        for (int count = 0; count <= 30; count += 6) //read five numbers betwen 1 and 30
        {
            for (int i = 1; i <= count; i++)
            {
                System.out.print("*");
            }
            System.out.printf("%n%n");
            
        }    
    }    
}
