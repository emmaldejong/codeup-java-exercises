package shapes;

public class Circle {
   private double radius;

   private static int numberOfCircles = 0;

// ##### CONSTRUCTOR
    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public double getArea(double radius) {
        return Math.PI * (radius * radius);
    }
    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static int getNumberOfCircles () {
        return numberOfCircles;
    }
}
