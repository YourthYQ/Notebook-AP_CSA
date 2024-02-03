package Note.AbstractClass;

public class Cat extends Animal{//抽象类的子类 如果为非抽象类，需override(重写)抽象父类中所有的抽象方法
    @Override
    public void eat() {
        System.out.println("Eat of Cat");
    }

}
