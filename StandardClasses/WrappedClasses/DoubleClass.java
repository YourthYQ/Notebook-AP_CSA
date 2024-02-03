package Note.StandardClasses.WrappedClasses;

//Double(value), compareTo, equals, toString(以字符串形式表示Double对象)
public class DoubleClass {

    public static void main(String[] args) {

        Double a = new Double(99.0);
        Double b = new Double("3.14");
        System.out.println(a.equals(b));

        Double c = new Double(3);
        Double d = new Double(5.00);
        Double e = new Double(3.00);
        System.out.println(c.compareTo(d));
        System.out.println(d.compareTo(c));
        System.out.println(c.compareTo(e));

        System.out.println(c.equals(e));

        //.toString()--以字符串的形式表示出Double对象
        Double f = new Double(971);
        Double g = new Double(964);
        System.out.println(f.toString() + " & " + g.toString());//971 + 964 (以字符串的形式表示出变量)

    }

}
