package person;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Default";
        this.age = 0;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @MarkerAnnotation
    public void methodToCall() {
        System.out.println("Yes, this is a method to call");
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}