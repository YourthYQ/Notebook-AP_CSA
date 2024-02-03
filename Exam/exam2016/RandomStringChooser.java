package exam2016;

import java.util.ArrayList;

public class RandomStringChooser {

    private ArrayList<String> wordList;

    public RandomStringChooser(String[] wordArray) {
        wordList = new ArrayList<String>();
        for (int i = 0; i < wordArray.length; i++) {
            wordList.add(wordArray[i]);
        }
    }

    public String getNext() {
        int index = (int)(Math.random()*(wordList.size()));
        if (wordList.size() > 0)
            return wordList.remove(index);
        else
            return "NONE";
    }

    public static void main(String[] args) {
        String[] wordArray = {"wheels","on","the","bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            System.out.println(sChooser.getNext() + "");
        }
    }

}
