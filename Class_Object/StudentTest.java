package Note.Class_Object;

public class StudentTest {

    public static void main(String[] args) {
        //create object
        Student SHY = new Student();
        //use object(instance variable)
        /* SHY.studentName = "SHY";(Error因为studentName被private)
           SHY.studentAge = 18;(Error因为studentAge被private) */


        //get
        SHY.getStudentName();
        SHY.getStudentAge();
        //int初始值为0，String为null，boolean为false
        System.out.println(SHY.getStudentName() + ", Age " + SHY.getStudentAge());
        //set
        SHY.setStudentName("SHY");//Please enter your age exactly!
        SHY.setStudentAge(18);//Please enter your age exactly!
        System.out.println(SHY.getStudentName() + ", Age " + SHY.getStudentAge());


        //use member method
        SHY.study();
        SHY.doHomework();
    }

}
