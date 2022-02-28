package Chapter_11.ex11.sevnteen;

import java.io.IOException;

public class ExceptionTest {

    //method main
    public static void main(String[] args)  {

        //try block to throw and handle Exceptions
        try
        {
            throw new ExceptionB("Exception type B");


        }
        catch (ExceptionB exceptionB)
        {
            System.out.println(exceptionB);
            try {
                throw new ExceptionA("Exception type A");
            } catch (ExceptionA e) {
                e.printStackTrace();
            }
            throw new NullPointerException();
        } catch (NullPointerException nullPointerException)
        {
            System.err.println(nullPointerException);

            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
