package chapter8.ex8.eight;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(12,31,1967);
        System.out.println("Date before calling nextDay()");
        System.out.println(date.toString());
        System.out.println();
        System.out.println();
        date.nextDay();
        System.out.println("Date after calling nextDay()");
        System.out.println(date.toString());

    }
}
