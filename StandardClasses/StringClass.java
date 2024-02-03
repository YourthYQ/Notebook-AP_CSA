package Note.StandardClasses;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

//equals, length, indexOf, subString, compareOf, (charAt, toString)
public class StringClass {

    public static void main(String[] args) {


        //==
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);//ture
        //'String str = ""' not create new class, two variables also in the same class
        //compare both the memory address and the context of string

        //str.equals(str)
        String c = new String("World");
        String d = new String("World");
        System.out.println(c == d);//false
        //'String str = new Sting()' creates new class, changing the memory address
        System.out.println(c.equals(d));//true
        /* 'str1 == str2' compares with each 'memory address'
           'str1.equals(str2)' compares with each string */

        //str.equalsIgnoreCase(str)
        String e = "Hello World!";
        String f = "hello world!";
        System.out.println(e.equalsIgnoreCase(f));//true


        //str.length()--字符串长度
        String g = "Hello World!";
        int glength = g.length();//计算字符串长度(包括空格和符号)
        System.out.println(glength);//12


        //str.indexOf(substr)--返回某字符串首次出现的位置(由0开始)，也可用来判断str中是否存在某字符
        String h = "Hello World!";
        int hIndex = h.indexOf("l");
        System.out.println(hIndex);
        System.out.println(h.indexOf("llo"));//2 (indexOf多个字符，则返回第一个字符的位置)
        System.out.println(h.indexOf("A"));//-1 若无此字符，output则为-1

        //str.lastIndexOf(substr)--返回指定字符串最后出现的位置
        int hLastIndex = h.lastIndexOf("l");
        System.out.println(hLastIndex);//9
        System.out.println(h.lastIndexOf(""));//12 (若lastIndexOf("")参数为空字符串，其返回值则与length()相同)


        //str.subString(int beginIndex)
        String i = "Hello World!";
        String iSub = i.substring(2);
        System.out.println(iSub);//llo World!
        String j = "Dog";
        System.out.println(j.substring(3));//Empty Character(3>)
        /* In str.substring(i)
           If i(str.length()) = Largest Index of str + 1,
           output will be Empty Character(But not Error) */

        //str.subString(int beginIndex, int endIndex)
        String iSubS = i.substring(2,4);//[2,4) 2为闭区间，4为开区间
        System.out.println(iSubS);//ll


        //str.compareTo(str);
        //precedence of letters(字母的优先级)
        String A = "aaa";
        String A1 = "aaa";
        String B = "bbb";
        String C = "ccc";
        System.out.println(A.compareTo(B));//<0 (-1)
        /* str1.compareTo(str2) < 0
           str1 precedes str2 in the dictionary */
        System.out.println(B.compareTo(A));//>0 (1)
        /* str1.compareTo(str2) > 0
           str1 follows str2 in the dictionary */
        System.out.println(A.compareTo(A1));//=0 (0)
        /* str1.compareTo(str2) == 0
           str1.equals(str2) */
        System.out.println(A.compareTo(C));//<0 (-2)

        //precedence among number, lowercase & uppercase(数字，小写字母，大写字母)
        String Number = "0";
        String lowerCase = "a";
        String uppperCase = "A";
        System.out.println(Number.compareTo(lowerCase));//<0 (-49)
        System.out.println(Number.compareTo(uppperCase));//<0 (-17)
        System.out.println(lowerCase.compareTo(uppperCase));//>0 (32)
        //number < uppercase < lowercase(数字在大写字母前，大写字母在小写字母前)

        //compareOf() between words & long string(单词等长字符串间的compareOf)
        /*要么比较首字母 或者比较总长度*/
        String s1 = "Hot";
        String s2 = "Hotel";
        String s3 = "Dog";
        String s4 = "dog";
        System.out.println(s1.compareTo(s2));//<0 (-2)
        System.out.println(s2.compareTo(s1));//>0 (2)
        /* 若两个String前半部分的字符相等，则对两个String的长度进行比较
           "Hot".compareTo("Hotel") 两String总长度相差2个字符(String1比String2少两个字符) */
        System.out.println(s1.compareTo(s3));//>0 (4)
        System.out.println(s2.compareTo(s3));//>0 (4)
        /* 若两个以单词为基础的String(具有多字符的字符串)进行比较，(字符串与字符串进行比较时)
           则为 两个字符串的首字母进行对比
           "Hot".compareTo("Dog") 可转化为 "H".compareTo("D") */
        System.out.println(s3.compareTo(s4));//<0 (-32)


        //precedence between int(double) and String
        String precedenceString = "Precedence";
        System.out.println(7 + 8 + (7 + 8) + precedenceString + 7 + 8 +(7 + 8));//30Precedence7815
        /* First Step,计算两括号内的内容(括号优先级最高)=>(7+8+15+precedenceString+7+8+15)
           Second Step,从左至右依次进行运算
           =>(30+precedenceString+7815)(运算到第一个String时 结束之后的基础运算)
           =>(30Precedence7815) */


        //.indexOf(substr)找位置
        //.subString(index)找字符

        /* str.charAt()--返回字符串中的某位置的字符
           String g = "Hello World!";
           char gChar = g.charAt(6);
           System.out.println(gChar);//W */

        /* str.toString()--输出整个字符串
           String h = "Hello World!";
           System.out.println(h.toString()); */

        /* char[] array = {'J', 'a', 'v', 'a', ',', 'H', 'e', 'l', 'l', 'o', ',', 'W', 'o', 'r', 'l', 'd'};
           String e = new String(array);
           System.out.println(e);
           System.out.println(e.toUpperCase());//'str.' can call functions in the resource library */

        /* StringBuffer
           StringBuffer g = new StringBuffer("Hello World!");
           System.out.println(g);
           String h = new String("a");
           System.out.println(g.replace(1,3,h));
           System.out.println(g.reverse()); */

        /* Date
           Date i = new Date();
           System.out.println(i);
           Calendar
           Calendar j = Calendar.getInstance();
           System.out.println(j); */

    }
}
