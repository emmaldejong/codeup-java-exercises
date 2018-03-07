package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}


//this type of shape extends the Shape Class and implements the two getArea and getPerimeter methods in the Measurable interface
//this sets the protected properties and the constructor and the getters for it's subclasses of Rectangle and Shape

//it also has 2 abstract methods for length and width setters