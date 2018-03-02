public class Person {
    private String name;

    public void sayHello() {
        System.out.println("Say hello, " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
