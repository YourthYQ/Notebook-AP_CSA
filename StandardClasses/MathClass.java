package Note.StandardClasses;

//Math Random, Rounding Number, sqrt, pow & abs
public class MathClass {

    public static void main(String[] args) {

        System.out.println(Math.E);//e
        System.out.println(Math.PI);//π
        System.out.println(Math.sqrt(9));//square(平方根)
        System.out.println(Math.cbrt(8));//三次根号
        System.out.println(Math.pow(2, 3));//power(次方运算)
        System.out.println(Math.max(3.4, Math.PI));//取最大值
        System.out.println(Math.min(3.4, Math.PI));//取最小值
        System.out.println(Math.abs(-10.3));//absolute(绝对值)

        //random number
        //0-100以内的随机数(不包含100)(0 <= f < 100)
        double f = Math.random() * 100;
        //Make random Numbers appear in hundreds at most
        System.out.println((int) f);
        //Make random Numbers appear with form of int

        //math random(internal)
        //0-100以内的随机数(包含100)(0 <= output <= 100)
        int g = 0;
        int h = 100;
        System.out.println((int)(g + Math.random()*(h-g+1)));
        /* num1 + Math.random()*(num2 - num1 + 1)
           1 + (2 - 1 + 1) */

        //rounding number
        System.out.println(Math.rint(3.45));//3.0
        System.out.println(Math.rint(2.5));//2.0
        System.out.println(Math.rint(3.5));//4.0
        //Math.rint()方法中，当num距离两边整数距离相同时，则取偶数
        System.out.println(Math.round(3.45));//3
        //Only can be rounded to the tenth place

        /* System.out.println(Math.toDegrees(Math.PI));
           System.out.println(Math.toRadians(180));
           System.out.println(Math.sin(Math.PI/3));
           System.out.println(Math.sqrt(3)/2); */

    }

}
