package Note.Inheritance;

//Inheritance Sequence, this & super
//AClass extends BClass (A类继承了B类)
public class Child extends Father {

    public int height = 178;
    public int age = 20;

    public void show() {

        //Inheritance Sequence
        //子类的local(子类的局部范围内) > 子类的instance(子类的成员范围内) > 父类的instance(父类的成员范围内)
        //最先访问 子类 的local variable
        int age = 30;
        System.out.println(age);
        //用this关键字访问 子类 的instance variable
        System.out.println(this.age);
        //用super关键字访问 父类 的instance variable
        System.out.println(super.age);

        //this & super
        //this访问本类 super访问父类
        /* instance variable
           this.实例变量名 or super.实例变量名 */
        /* constructor
           this(...) or super(...) */
        /* instance method
           this.实例方法名(...) or super.实例方法名(...) */

    }

    public Child() {
        //super();//默认为super()，即无参constructor，所以super()可有可无
        super(30);//由于父类未定义无参constructor，则需要手动访问父类中的含参constructor
        System.out.println("子类--无参");
    }
    public Child(int age) {
        super(30);
        System.out.println("子类--含参");
    }

}
