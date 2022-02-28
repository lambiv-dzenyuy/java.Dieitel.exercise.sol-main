package Chapter_11.ex11.sevnteen;

public class ExceptionA extends Exception {

private String exceptionA;

    public ExceptionA(String exceptionA) {
        this.exceptionA =exceptionA;
    }
    @Override
    public String toString()
    {return exceptionA;}


}
