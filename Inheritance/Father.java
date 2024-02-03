package Note.Inheritance;

public class Father {

    public int age = 40;

    //public Father() { System.out.println("父类--无参"); }

    /* 当父类有且只定义了带参constructor，(无参(default constructor)未被定义)，
       且子类调用super()时，程序会报错
       (因为当人为定义一个constructor(无论是带参或无参)后，系统将不会自动创建default constructor)
       (然而子类中super()会默认调用一次父类中的default constructor)*/
    /* public Father() {
           System.out.println("父类--无参");
       } */

    public Father(int age) {
        System.out.println("父类--含参");
    }

}