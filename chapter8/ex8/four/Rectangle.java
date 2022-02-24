package ex8.four;
public class Rectangle {
    private float width = 1; // width of rectangle
    private float lenght = 1; // lenght of rectangle

    // constructor
    public Rectangle(float width, float lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    // setter methods for each data members
    public void setWidth(float w) {
        if (w > 0.0)
            width = w;
    }

    public void setLenght(float l) {
        if (l > 0.0)
            lenght = l;
    }

    // getter methods for the two data members
    public float getWidth() {
        return width;
    }

    public float getLenght() {
        return lenght;
    }

    public float perimeter() {
        return 2 * width + 2 * lenght;
    }
}


