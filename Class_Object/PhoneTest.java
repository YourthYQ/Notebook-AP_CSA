package Note.Class_Object;

public class PhoneTest {

    //创建或使用object 看作测试类，需用到main() method
    public static void main(String[] args){
        //create object
        Phone apple = new Phone();

        //use instance variable
        System.out.println(apple.brand);//String's default output: null
        System.out.println(apple.price);//int's defalut output: 0

        //use instance method
        apple.call();
        apple.sendMessage();
    }

}
