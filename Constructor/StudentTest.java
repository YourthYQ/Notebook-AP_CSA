package Note.Constructor;

public class StudentTest {

    public static void main(String[] args) {
        //parameter-free constructor(无参构造函数)
        Student s1 = new Student();
        s1.getData();
        //public Student(String studentName)
        Student s2 = new Student("SHY");
        s2.getData();
        //public Student(String studentName, int studentAge)
        Student s3 = new Student("SHY", 18);
        s3.getData();

        //String 默认output为 null
        //int 默认output为 0
    }

}
