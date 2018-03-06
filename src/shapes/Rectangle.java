package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static double getPerimeter(double length, double width){
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }
}
