package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        Rectangle box2 = new Square(5);

        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());
    }
}

//I originally did the math wrong on the override methods on the Square object so I knew from the souts that I was using
//were "grabbing" the right the Square methods v the Rectangle methods, but you should be able to tell based on the reference variable that you are using