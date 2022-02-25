package chapter8.ex8.ten;

public class TrafficLightTest {
    public static void main(String[] args) {

        System.out.println("All traffic lights");
        //print all traffic lights in  enum types
        for(TrafficLight trafficLight : TrafficLight.values())
        {
            System.out.println(trafficLight.name() +" duration : " + trafficLight.getDuration());
        }
    }
}
