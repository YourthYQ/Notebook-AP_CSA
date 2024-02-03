package Note.AbstractClass;

//抽象类的子类 要么override(重写)抽象方法 要么同时将其定义为abstract类
public abstract class Animal {//abstract class(抽象类里不一定要有抽象方法)

    public abstract void eat();//abstract method
    //未定义方法体(method body)的方法 需在方法命名时加入abstract关键字，同时需要在类名前加入abstract关键字(abstract method cannot have method body)

    public void sleep() {//abstract class中可以定义非抽象方法，但抽象方法不能在非抽象类中定义

    }
    
}
