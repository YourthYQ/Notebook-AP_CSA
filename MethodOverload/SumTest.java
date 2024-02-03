package Note.MethodOverload;

import static Note.MethodOverload.Sum.sum;

//calling method
public class SumTest {

    public static void main(String[] args) {
        //calling method(调用方法)

        //void sum()
        sum();

        //int sum(int a)
        int result1 = sum(10);
        System.out.println(result1);

        //sum(double a, double b)
        double result2 = sum(10,20.0);
        System.out.println(result2);

        //sum(int a, double b, String c)
        String result3 = sum(10,20.0," YO");
        System.out.println(result3);

    }
}
