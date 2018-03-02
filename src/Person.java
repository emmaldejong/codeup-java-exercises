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
        Person per = new Person("emma");

        System.out.println(per.getName());
//        System.out.println(per.setName("dwight"));

        Person.sayHello();
    }


}

