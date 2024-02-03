package Note.MethodOverload;

//method overloading, formal parameter(形参) & actual parameter(实参)
public class Sum {

    /* 只要同一个class中，两个method的
       method's name相同
       method's formal parameter(形参类型或数量)不同(只要形参类型 或 数量 或 顺序 三者之一不同，即可构成有效的MethodOverload)
        public static boolean(int a, String b) { }(Origin)
        public static boolean(String c, String d) { }
        public static boolean(int a, int b) { }(Efficient-Different Data Type)
        public static boolean(int a, String b, double c) { }(Efficient-Different Number)
        public static boolean(String b, int a) { }(Efficient-Different Sequence)
         //两个数据类型(种类)不同的形参，其顺序也需不相同
       即可构成method overloading(方法重载)
     */
    public static void sum() {
        System.out.println("YO void!");
    }

    public static int sum(int a) { return a; }

    public static double sum(double a, double b) {
        return a + b;
    }
    //public static double sum(double b, double a) { return a + b; }
    //即使两个形参顺序不相同，但数据类型相同，则也无法成功进行Method Overloading

    public static String sum(int a, double b, String c) {
        return a + b + c;
    }
    public static String sum(double b, int a, String c) {
        return a + b + c;
    }




}
