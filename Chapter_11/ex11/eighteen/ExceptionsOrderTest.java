package Chapter_11.ex11.eighteen;
//demonstrating that order of catch of Exception matters

import Chapter_11.ex11.sevnteen.ExceptionA;
import Chapter_11.ex11.sevnteen.ExceptionB;

public class ExceptionsOrderTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("aksjda");
        }
        catch (Exception exception) // catches all exceptions of all sub classes
        {
            System.out.println(exception);
        }catch (ExceptionB e) //exception of super class Exception genereates a compilation error
        {
            e.printStackTrace();
        }
    }
}
