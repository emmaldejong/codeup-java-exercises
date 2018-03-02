import java.util.Scanner;

public class Person {
    public String name;
    // returns the person's name
    public String getName() {
        return name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    public String sayHello() {
        return name +" says hi!";
    }

    public static void main(String[] args) {
        System.out.println(sayHello("emma"));
    }
}

