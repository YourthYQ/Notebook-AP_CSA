package Note.Constructor;

//constructor,
public class Student {

    private String studentName;
    private int studentAge;

    //constructor(用于给instance variable初始化赋值)(initialize instance variable)
    //default constructor(无参构造函数)
    public Student() { }
    public Student(String studentName) {
        this.studentName = studentName;
    }
    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void getData() {
        System.out.println(studentName + ", Age " + studentAge);
    }

}
