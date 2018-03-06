package shapes;

public class Square extends Rectangle{
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    //super(side, side) is referring to the constructor on the Rectangle object b/c the Rectangle constructor has 2 parameters as well.

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
