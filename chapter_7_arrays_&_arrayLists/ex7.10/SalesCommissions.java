//use a one dimensional array to process sales commissions for employees in a company

import java.util.Arrays;

public class SalesCommissions 
{
  
    public static void main(String[] args)
    {
      // student response array (more typically, input at runtime)
      int[] weekGrossSales = {2323,123, 3445, 4525, 565, 54, 423, 234, 32, 232, 5676, 67, 88, 55, 2424, 2344, 3454, 2321, 1232, 4345, 6786, 4323, 2345, 5657, 2432, 52794, 452389, 45493, 273492,48208948,7426,416863,4879,746782,4857209,247892,27439 };
      int[] frequency = new int[11]; // array of frequency counters
      int normalPay = 200;
      
      for(int sales: weekGrossSales)
      {
        double surplusPay =  sales * 0.09;
        double totalPay = surplusPay + normalPay;
        if (totalPay >= 200 && totalPay < 300)
          ++frequency[2];
        if(totalPay >= 300 && totalPay < 400)
          ++frequency[3];
        if(totalPay >= 400 && totalPay < 500)
          ++frequency[4];
        if(totalPay >= 500 && totalPay < 600)
          ++frequency[5];
        if(totalPay >= 600 && totalPay < 700)
          ++frequency[6];
        if(totalPay >= 700 && totalPay < 800)
          ++frequency[7];
        if(totalPay >= 800 && totalPay < 900)
          ++frequency[8];
        if(totalPay >= 900 && totalPay < 1000)
          ++frequency[9];
        if(totalPay >= 1000)
          ++frequency[10];
    
      }

      System.out.printf("%3s %18s%n", "Range", "Frequency");

      for (int counter = 2; counter<frequency.length; counter++)
      {
        if (counter == 10)
        System.out.printf("$1000 and over %4d%n", frequency[10]);
        else
          System.out.printf("$%3d-%d %10d%n", counter*100, counter*100 + 99, frequency[counter] ) ;
      }
    }


}