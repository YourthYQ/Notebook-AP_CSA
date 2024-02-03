package Note.Polymorphism;

public class Test {

    public static void main(String[] args) {

        Animal b = new Animal();

        //多态的 向上转型(子类给父类赋值，父类指向子类对象)
        Animal a = new Cat();

        //instance method可以override(重写)，但instance variable不可
        //多态中 不能直接使用子类的功能(Method)

        /*
        * static binding 编译
        * dynamic binding 运行
        */

        //instance variable
        //编译看等号左边类型，运行也看等号左边类型
        System.out.println(a.age);//输出animal类中的age，而不是cat类中的age
        //System.out.println(a.weight);(Compile-time Error) Object a 为Animal类型，而weight仅在cat类中定义，而并未在animal类中定义

        //instance method
        //编译看等号左边类型，运行看等号右边类型
        a.eat();//调用cat类中的eat()
        //a.playGame();(Compile-tine Error)

        a.duplicate();//调用animal类中的duplicate()
        //如若子类中未定义此方法，则调用父类的方法

        //多态的 向下转型(父类给子类赋值，子类指向父类对象)
        Cat c = (Cat)a;
        //Cat e = (Cat)b;(Error-ClassCastException)
        c.eat();
        c.playGame();

        Animal d = new Baby();
        d.eat();

    }

}
