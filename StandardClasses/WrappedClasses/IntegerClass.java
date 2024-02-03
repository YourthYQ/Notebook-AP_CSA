package Note.StandardClasses.WrappedClasses;

import jdk.swing.interop.SwingInterOpUtils;

//Integer(value), compareTo, equals, toString(进制转换)
public class IntegerClass {

    public static void main(String[] args) {

        //Integer
        //Integer(value)--初始化赋值(Boxing(括号内有数值))
        Integer a = new Integer(7);//int
        Integer b = new Integer("7");//String
        //Integer b = new Integer("Hr");(NumberFormatException)(Integer包装类的参数只能是int，无论是double还是String)
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);//14
        //Integer类型的变量，无论input类型是int还是String，output都为int
        //所以a和b可进行加减乘除等数字运算
        boolean aEqualsTob = a.equals(b);
        System.out.println(aEqualsTob);//true
        //int intValue()--将Integer以int形式输出(Unboxing(括号内无数值))
        int A = a.intValue();
        int B = b.intValue();
        System.out.println(A + B);

        //compareTo(Integer)--判断大于，小于，还是等于
        Integer c = new Integer(964);
        Integer d = new Integer(993);
        System.out.println(c.compareTo(d));//-1 (c < d)(若小于，则返回负数)
        Integer e = new Integer(992);
        Integer f = new Integer(991);
        System.out.println(e.compareTo(f));//1 (e > f)(若小于，则返回正数)
        Integer g = new Integer(911);
        Integer h = new Integer(911);
        System.out.println(g.compareTo(h));//0 (g = h)(若等于，则返回0)

        //equals(obj)--判断是否相等
        System.out.println(g.equals(h));//true

        //toString--Integer中 括号内无参数的toString (toString以字符串形式输出)
        Integer toS1 = new Integer(5);
        Integer toS2 = new Integer(5);
        String toS3 = toS1.toString();
        String toS4 = toS2.toString();
        System.out.println(toS1 + toS2);//10
        System.out.println(toS1 + toS3);//55
        System.out.println(toS3 + toS4);//55

        //toString()--Integer中 括号内带参的toString 则为conversion of number systems(进制转换)(以数字形式输出)
        String str1 = Integer.toString(999);//十进制(默认进制)
        String str2 = Integer.toBinaryString(999);//二进制
        String str3 = Integer.toHexString(999);//十六进制
        System.out.println(str1 + str2 + str3);//Integer中的toString()为数字间的进制转换，因此String输出的是数字，而不是字符串
        System.out.println("Decimalism is " + str1 + "\nBinary is " + str2 + "\nHex is " + str3);

        //Variables
        //Int Storage(from -2^31 to 2^31-1)
        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt);//2^31-1
        System.out.println(maxInt + 1);//maxInt + 1 = minInt
        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt);//-2^31
        System.out.println(minInt - 1);//minInt - 1 = maxInt
        System.out.println("Max of Integer is " + maxInt + "\nMin of Integer is " + minInt);

    }

}
