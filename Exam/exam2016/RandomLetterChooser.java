package exam2016;

public class RandomLetterChooser extends RandomStringChooser{

    public RandomLetterChooser(String word) {
        super(getSingleLetters(word));
    }

    public static String[] getSingleLetters(String str) {
        String[] singleLetters = new String[str.length()];
        for (int i = 0; i < singleLetters.length; i++) {
            singleLetters[i] = str.substring(i,i+1);
        }
        return singleLetters;
    }

}
