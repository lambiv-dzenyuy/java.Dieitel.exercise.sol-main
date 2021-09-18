/*(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333....]*/

import java.util.Scanner;//program uses the Scanner class

class Arithsmall_largest {
    
    public static void main(String[] args)
    {

        //Creating a scanner to read input from the command line
        Scanner input = new Scanner(System.in);

        int num1;//first number in the series
        int num2;//second number in the series
        int num3;//third number in the series
        int sum; // the sum of num1, num2 and num3
        int avg; // the average of num1, num2 and num3
        int product; //the product of num1, num2 and num3
        int largest=0;//the largest of num1, num2 and num3
        int smallest=0;//the smallest of num1, num2 and num3


        System.out.print("Enter first integer: ");//prompt
        num1 = input.nextInt();//read num1 from the command line

        System.out.print("Enter second integer: ");//prompt
        num2 = input.nextInt();//read num2 from the command line

        System.out.print("Enter third integer: ");//prompt
        num3 = input.nextInt();//read num3 from the command line

        sum = num1 + num2 + num3; //sums num1 num2 and num3 and store in sum

        avg = sum/3;//evaluates the average of num1, num2 and num3 and store in avg

        product = num1 * num3 *num2;//evaluates the product of num1 num2 and numm3 and store in product

        if (num1>num2 & num1>num3){
            largest=num1;
        if(num2<num3){
            smallest=num2;
        }
            else
                {smallest=num3;}}
            


        if (num2>num1 & num2>num3){
                largest=num2;
            if(num1<num3){
                smallest=num1;}
            else{
                smallest=num3;}}


        if (num3>num2 & num3>num1){
            largest=num3;
            if(num2<num1){
                smallest=num2;}
            else{
                smallest=num1;}}

        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Product  is %d%n", product);
        System.out.printf("Largest is %d%n", largest);
        System.out.printf("Average is %d%n", avg);
        
        System.out.printf("Smallest is %d%n", smallest);
        
    }
}