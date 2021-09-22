public class Factorials 
{
    public static void main(String[] args) 
    {
       //loop from 1 to 20 
       for (int count =1; count <= 20; count++)
       {
           factorial(count);
       } 
    }
    
    //creating a function to calculate factorial
    public static void factorial(int number) //number to get factorial
    {
        long fac=1L;//initialize factorial to be 1
        for (int count=1; count <= number; count++)
        {
            fac *= count;
        }
        //print out the number and factorial
        System.out.printf("%4d: %d%n", number, fac );
    }
}