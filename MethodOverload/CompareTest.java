package Note.MethodOverload;

import static Note.MethodOverload.Compare.compare;

public class CompareTest {

    public static void main(String[] args) {

        //int--boolean compare(int a, int b)
        System.out.println(compare(10,10));

        //int & double--boolean compare(int a, double b)
        System.out.println(compare(10,10.0));

        //String--boolean compare(String a, String b)
        System.out.println(compare("yo","YO"));

    }

}
