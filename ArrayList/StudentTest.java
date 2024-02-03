package Note.ArrayList;

import java.util.*;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> arrList = new ArrayList<Student>();

        Student s1 = new Student("Sapphire", 18);
        Student s2 = new Student("Nine", 17);

        arrList.add(s1);
        arrList.add(s2);

        for (int i = 0; i < arrList.size();i++) {
            Student s = arrList.get(i);
            System.out.println(s);
            System.out.println(s.getName() + ", " + s.getAge());
        }

    }

}
