package chapter10.ex10.thirteen;

public class Triangle extends TwoDimensionalShape{
    private double height; // height of triangle
    private double base; // base dimension of triangle

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
