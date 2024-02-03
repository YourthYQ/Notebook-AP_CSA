package Note.Class_Object;

//static(difference between static and non-static)
public class Reverse {

    public Reverse() {}

    public void reverseWordI(String originalWord) {

        String reverseWord = "";
        String[] wordArray = new String[originalWord.length()];;
        for(int i = 0; i < originalWord.length(); i++)
            wordArray[i] = originalWord.substring(i,i+1);
        for(int i = wordArray.length - 1; i >= 0; i--)
            reverseWord += wordArray[i];
        System.out.println(reverseWord);

    }

    public static void reverseWordII(String originalWord) {

        String reverseWord = "";
        String[] wordArray = new String[originalWord.length()];;
        for(int i = 0; i < originalWord.length(); i++)
            wordArray[i] = originalWord.substring(i,i+1);
        for(int i = wordArray.length - 1; i >= 0; i--)
            reverseWord += wordArray[i];
        System.out.println(reverseWord);

    }

    public static void main(String[] args) {
        Reverse r1 = new Reverse();

        // reverseWordI("Sapphire");
        /* (Error)static method下只能直接调用static的method */
        reverseWordII("Sapphire");

        r1.reverseWordI("Sapphire");
        //Reverse.reverseWordI();
        /* (Compile-time Error)reverseWordI()不为static方法 无法直接用class调用 */

        r1.reverseWordII("Sapphire");
        Reverse.reverseWordII("Sapphire");


    }

}
