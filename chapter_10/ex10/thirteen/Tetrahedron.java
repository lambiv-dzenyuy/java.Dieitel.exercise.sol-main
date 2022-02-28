package chapter_10.ex10.thirteen;

public class Tetrahedron extends ThreeDimensionalShape{
    private double sideLength; // width of each side of the cube

    //constructor
    public Tetrahedron(double sideLenght)
    {
        if(sideLenght<=0)
            throw new IllegalArgumentException("sideLength needs to be >0.0");
        this.sideLength = sideLenght;
    }

    public double getSideLength() {
        return sideLength ;
    }

    public void setSideLength(double sideLength) {
        this.sideLength  = sideLength;
    }

    //return area of tetrahedron
    @Override
    public double getArea() {
        return sideLength *sideLength *Math.sqrt(3);
    }

    //return volume of tetrahedron

    public double getVolume() {
        return (sideLength *sideLength *sideLength )/(6*Math.sqrt(2));
    }
}
