package chapter_10.ex10.thirteen;

public class ShapeTest {
    public static void main(String[] args) {
        Cube cube = new Cube(4);
        Circle circle = new Circle(4);
        Sphere sphere = new Sphere(4);
        Tetrahedron tetrahedron = new Tetrahedron(4);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3,4);

        Shape[] shapes = new Shape[6];
        shapes[0]=cube;
        shapes[1]=circle;
        shapes[2]=sphere;
        shapes[3]=tetrahedron;
        shapes[4] = square;
        shapes[5] = triangle;

        for(Shape shape : shapes)
        {
            if (shape instanceof TwoDimensionalShape)
            {
                System.out.print(shape.getClass().getName() + "\t");
                System.out.printf("%s : %.2f%n%n", "area", shape.getArea());
            }
            else if (shape instanceof ThreeDimensionalShape)
            {
                ThreeDimensionalShape tshape =(ThreeDimensionalShape) shape;
                System.out.print(shape.getClass() .getName() + "\t");
                System.out.printf("%s : %.2f ", "area", tshape.getArea());
                System.out.printf("%s : %.2f%n%n", "volume", tshape.getVolume());
            }
        }
    }
}
