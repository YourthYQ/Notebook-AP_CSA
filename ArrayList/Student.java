package Note.ArrayList;

public class Student {

    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge() {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + ", " +  age;
    }

}
