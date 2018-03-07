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

//
//================================= INHERITANCE and POLYMORPHISM BONUSES
//        BONUS 1
//        Create a class of Animal
//        Create a class of Pet
//        Create a class of Dog, Fish, Cat that extends Pet

//        Include several properties and methods in each of the
//        classes that keep replicated code to a minimum but highlight
//        the unique state and behaviour of each part of the inheritance chain.

//        Create a class PetTester with the following methods:

//        public static String getSpeciesInfo() that returns the value of the species
//        this method should take in any Animal object but test it in the main method
//        with instantiated Dog, Fish, Cat objects.

//        public static String createPet() that returns a specific pet object given
//        an instantiated Pet object and the String value of the species type


//        BONUS 2
//        Create a class, StringTransform

//        Include instance properties:
//        String originalString
//        String convertedString

//        Include instance methods:
//        subStringExtractor to return a substring of the originalString string
//        given a starting and ending index
//        stringToArrayOfWords that takes in a string and splits it into an array
//        of words

//        Create a class, PigLatinTransformer that extends StringTransform
//        include methods as needed to create a pig latin converter
