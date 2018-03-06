package shapes;

public class Square extends Rectangle{
    private int side;

    public Square(int length, int width, int side) {
        super(length, width);
        this.side = side;
    }
}
