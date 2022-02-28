package chapter8.ex8.ten;

public enum TrafficLight
{
    RED(1),
    GREEN(2),
    YELLOW(3);

    private  final int duration;

    //constructor
    TrafficLight(int duration)
    {
        this.duration=duration;
    }

    public  int getDuration()
    {
        return duration;
    }
}
