package chapter_10.ex10.thirteen;

public class Sphere extends ThreeDimensionalShape{

    private double radius; // dimension of the radius

    // constructor
    public Sphere(double radius)
    {
        if(radius<=0)
            throw new IllegalArgumentException("radius needs to ne >0.0");
        this.radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // return area of sphere
    @Override
    public double getArea() {
        return 4*Math.PI*radius*radius;
    }

    //return volume of sphere
    @Override
    public double getVolume() {
        return 0;
    }
}
