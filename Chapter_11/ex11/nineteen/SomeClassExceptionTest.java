package Chapter11.ex11.nineteen;

public class SomeClassExceptionTest {
    public static void main(String[] args) {
        try {
            SomeClass ob = new SomeClass();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
