package Note.Inheritance;

import java.util.zip.CheckedInputStream;

//无参和含参Constructor in Inheritance
public class Test {

    public static void main(String[] args) {
        //Constructor in Inheritance

        //当 无参constructor 被父类定义时
        /* 每一个子类的constructor，第一条语句默认为super()
           ()括号内无参数，即先访问了父类中的 无参constructor */
        // 子类中 所有的constructor 都会默认访问父类中的 无参constructor
        /* Child c1 = new Child();//子类无参 output is 父类--无参 + 子类--无参
           Child c2 = new Child(30);////子类含参 output is 父类--无参 + 子类--含参 */

        //当 无参constructor 未被父类定义时(Child Class中用super(parameter)调用)
        Child c1 = new Child();//子类无参 output is 父类--含参 + 子类--无参
        Child c2 = new Child(30);////子类含参 output is 父类--含参 + 子类--含参

    }

}
