package chapter8.ex8.nine;
//importing static methods of the java.lang.Math library
import  static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import static java.lang.Math.E;
import static  java.lang.Math.PI;

public class StaticImportTest
{
    public static void main(String[] args)
    {
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
        System.out.printf("E = %f%n", E);
        System.out.printf("PI = %f%n", PI);
    }
} // end class StaticImportTest

