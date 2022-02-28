package chapter10.ex10.thirteen;

public class Circle extends TwoDimensionalShape{
    private double radius; //radius of the circle

    public Circle(double radius)
    {
        this.radius = radius;
    }

    //set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // return radius
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
