public class Person {
    private static String name;

    public static void sayHello() {
        System.out.println("Say hello, " + name);
    }

// ##### GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// ##### CONSTRUCTOR
    public Person(String name) {
        this.name = name;
    }

// #### MAIN METHOD
    public static void main(String[] args) {
//        Person per = new Person("emma");
//
//        System.out.println(per.getName());
//        per.setName("dwight");
//        System.out.println(per.getName());
//
//        Person.sayHello();

// ####### Exercise #2 - adding code block
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        returns true b/c they used the .equals method
//        System.out.println(person1 == person2);
//        returns false b;c they used == to compare the strings

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        returned true, but why did it return true, in the end person1 and person2 are strings???

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        you set person1 equal to person2 and then and then get name, you changed the person's name to jane and so both get names will out put the new name b/c you set them equal
    }


}

