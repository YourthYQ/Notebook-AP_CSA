package Note.MethodOverload;

public class Compare {

    //int
    public static boolean compare(int a, int b) {
        return a == b;
    }

    //int & double
    public static boolean compare(int a, double b) {
        return a == b;
    }

    //String
    public static boolean compare(String a, String b) {
        return a.equals(b);
    }

}
