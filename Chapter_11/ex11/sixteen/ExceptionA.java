package Chapter_11.ex11.sixteen;

public class ExceptionA extends Throwable {
    private String message="Exception type A" ; // exception message

    public ExceptionA(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return message;
    }
}
