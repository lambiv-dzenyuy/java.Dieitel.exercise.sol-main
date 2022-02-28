package chapter_10.ex10.thirteen;

public class Square extends TwoDimensionalShape{
    private double side; // dimension of one side of the square

    public Square(double side)
    {
        if(side<=0)
                throw new IllegalArgumentException("The dimension of a square must be >0.0");
        this.side =side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
