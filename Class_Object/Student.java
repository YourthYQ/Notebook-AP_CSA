package Note.Class_Object;

//with private, this, set & get
public class Student {

    //instance variable
    private String studentName;
    private int studentAge;


    /* instance variable被private了,
       则需要通过get()来获得访问权限，
       用set(value)来更改instance variable的值
     */
    //set & get method--studentName
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getStudentName() { return this.studentName; }
    //set & get method--studentAge
    public void setStudentAge(int studentAge) {
        if(studentAge >= 0 && studentAge <= 120)
            this.studentAge = studentAge;//this.studentAge作为instance variable，而studentAge为local variable
        else
            System.out.println("Please enter your age exactly!");
    }
    public int getStudentAge() {
        return this.studentAge;
    }


    //member method
    public void study() {
        //local variable
        String study= "Good Good Study";
        System.out.println(study);
    }
    public void doHomework(){
        //local variable
        String doHomework= "Day Day Up";
        System.out.println(doHomework);
    }

}