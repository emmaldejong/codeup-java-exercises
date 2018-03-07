package shapes;

public class Square extends Quadrilateral implements Measurable{
    protected double  side;

    public Square(double side) {
        super(side, side); //super(side, side) is referring to the constructor on the Rectangle object b/c the Rectangle constructor has 2 parameters as well.
        this.side = side;
    }

    //the super keyword calls the immediate parent constructor

    @Override
    public double getArea() {
        return side * side;
    }

    //length * length or width * width instead of creating the new "unnecessary" side property added to the square class

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void setLength(double side) {
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
        this.side = side;
    }
}
