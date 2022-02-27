package chapter10.ex10.thirteen;

public class Cube extends  ThreeDimensionalShape{

    private double sideLenght; // width of each side of the cube

    //constructor
    public Cube(double sideLenght)
    {
        if(sideLenght<=0)
            throw new IllegalArgumentException("sideLength needs to be >0.0");
        this.sideLenght = sideLenght;
    }

    public double getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    // return area of cube
    @Override
    public double getArea() {
        return 6*sideLenght*sideLenght;
    }

    // return volume
    @Override
    public double getVolume() {
        return sideLenght*sideLenght*sideLenght;
    }
}
