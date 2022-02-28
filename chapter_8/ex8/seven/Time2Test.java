package chapter8.ex8.seven;

class Time2Test {
	
public static void main(String args[])
{
	chapter8.ex8.seven.Time2 time = new Time2(23,59,59);
	System.out.println("time before calling the tick function");
	System.out.println(time.toString());
	
	System.out.println();
	System.out.println("After calling tick");
	time.tick();
	System.out.println(time.toString());
}
}