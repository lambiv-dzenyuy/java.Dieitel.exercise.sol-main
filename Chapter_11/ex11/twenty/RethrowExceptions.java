package Chapter11.ex11.twenty;

public class RethrowExceptions {
    public static void main(String[] args) {
        someMethod();
    }
    static void someMethod(){
        try {
            someMethod2();
        }catch (Exception e)
        {
            throw e;
        }
    }
    static void  someMethod2(){
        throw new RuntimeException("Exception from someMethod2");
    }
}
