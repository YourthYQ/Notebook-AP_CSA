package Note.Class_Object;

//instance variable, local variable, member method
//without private, set & get
public class Phone {

    //instance variable(实例变量)(member variable)(class内,method外的变量)
    String brand;
    int price;

    //instance method(成员方法)(不可为static)
    public static void call() {
        //local variable(局部变量)(method内的变量)
        int phoneNum = 911;
        System.out.println(phoneNum);
    }
    public void sendMessage() {
        //local variable
        String messageContext = "This is 991.";
        System.out.println(messageContext);
    }

}
