package Note.Class_Object;

import java.util.Arrays;

//static & this
public class ReverseTest {

    String originalSent;

    public static void main(String[] args) {
        Reverse r1 = new Reverse();

        // reverseWord("Sapphire");(Compile-time Error)
        /* 即this.reverseWord()，this指代本类(ReverseTest Class)
           但ReverseTest Class中不存在 reverseWord()方法*/

        r1.reverseWordI("Sapphire");
        // Reverse.reverseWordI("Sapphire");(Compile-time Error)

        r1.reverseWordII("Sapphire");
        Reverse.reverseWordII("Sapphire");
    }

}
