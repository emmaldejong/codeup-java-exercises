package shapes;

public class Square extends Rectangle{
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
