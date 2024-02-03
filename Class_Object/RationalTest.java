package Note.Class_Object;

//print of toString(), null & NullPointerException
public class RationalTest {

    public static void main(String[] args) {

        //toString()
        Rational q1 = new Rational(1,2);
        Rational q2 = new Rational(2,3);

        System.out.println(q1);//1/2
        System.out.println(q2);//1/2
        System.out.println(q1.toString());//1/2
        /* 若Rational Class中定义了toString() Method，
           那么print object or reference(reference data type-引用数据类型)时，将默认调用toString()Method */
        /* 若Rational Class中未定义了toString() Method，
           print结果则为此object or reference的内存地址(String Representation) */

        //null
        Rational q3 = null;//object or reference为null时，其内存地址不存在(所以q3无法调用任何方法 包括'toString()' 而是直接print其本身)
        Rational q4;
        System.out.println(q3);//null

        /* NullPointerException
           (有且仅当 一个'为null的object or reference'调用了method时 才会报错) */
        //null调用一个方法时
        q3.plus(q2);//(Error-NullPointerException)
        /* 若一个'为null的object or reference'，调用了一个method时
           则会造成Run-time Error(NullPointerException) */

        //null被一个方法调用时
        q2.plus(q3);//null
        /* 若一个'为null的object or reference为null'，被一个method调用时
           并不会产生任何Error */

        //一个为null的object对另一个object initialize时
        q4 = new Rational(q3);
        System.out.println(q4);//1/2
        //因q3未调用其它method，则不会出现Error

    }
}
