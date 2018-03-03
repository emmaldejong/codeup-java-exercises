package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Here's how many circles you have right now: ");
        System.out.println(Circle.getNumberOfCircles());

        enterCircles();

//        Input input = new Input();

//        do {
//            Circle circle =  new Circle(6);
//
//            double cir1 = input.getDouble("Enter the radius of your circle:");
//            circle.setRadius(cir1);
//
//            double area = circle.getArea();
//            System.out.println("The area of your circle is " + area);
//
//            double circumference = circle.getCircumference();
//            System.out.println("The circumference of your circle is " + circumference);
//
//            System.out.println("Here's how many circles you have now: " + circle.getNumberOfCircles());
//
//        } while (input.yesNo("Do you want to enter another radius?"));

//        double cir1 = input.getDouble("Enter the radius of your circle:");
//        circle.setRadius(cir1);
//
//        double area = circle.getArea();
//        System.out.println("The area of your circle is " + area);

//        double circumference = circle.getCircumference();
//        System.out.println("The circumference of your circle is " + circumference);

//        boolean choice = input.yesNo("Do you want to enter another radius?");
//        System.out.println();

//        if(choice) {
//            double cir2 = input.getDouble("Enter another radius:");
//            circle.setRadius(cir2);
//            double area2 = circle.getArea();
//            System.out.println("The area of this circle is:" + area2);
//            double circumference2 = circle.getCircumference();
//            System.out.println("The circumference of this circle is:" + circumference2);
//        }

    }

    public static int enterCircles() {
        Input input = new Input();
        Circle circle =  new Circle(6);
        do {

            double cir1 = input.getDouble("Enter the radius of your circle:");
            circle.setRadius(cir1);

            double area = circle.getArea();
            System.out.println("The area of your circle is " + area);

            double circumference = circle.getCircumference();
            System.out.println("The circumference of your circle is " + circumference);

//            System.out.println("Here's how many circles you have now: " + circle.getNumberOfCircles());

        } while (input.yesNo("Do you want to enter another radius?"));
//        return circle.getNumberOfCircles();
        return System.out.println(circle.getNumberOfCircles());
    }
}
