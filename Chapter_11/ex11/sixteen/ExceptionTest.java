package Chapter_11.ex11.sixteen;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            throw new ExceptionC("Caught ExceptionC subclass with super class ExceptionA");
        }
        catch (ExceptionA exceptionA)
        {
            System.err.println(exceptionA);
        }
    }
}
