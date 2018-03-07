package shapes;

public interface Measurable {

    double getPerimeter();
    double getArea();

}

//I'm going to implement this in my subclasses because I want to make sure that they have something (methods) that I can measure all my shapes with