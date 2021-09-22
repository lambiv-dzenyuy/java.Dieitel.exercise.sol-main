//calculating the product of all odd numbers between  1 and 15

public class OddProduct 
{
    public static void main(String[] args) 
    {
        //initialize constants
        int product =1;
        
        for (int count = 1; count <= 15; count +=2)
        {
            product *= count;
        }//end of for

        System.out.printf("%nThe prouct of all odd numbers between 1 and 15 is %d%n", product);
    }    
}
