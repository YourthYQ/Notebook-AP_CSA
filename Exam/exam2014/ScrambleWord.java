package exam2014;

import java.util.*;

public class ScrambleWord {

    public static String scrambleWord(String word) {

        String scrambleWord = "";
        ArrayList<String> wordList = new ArrayList<String>();

        for (int i = 0; i < word.length(); i++) {
            wordList.add(word.substring(i,i+1));
        }

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals("A") && (i+1) < wordList.size() && !wordList.get(i+1).equals("A")) {
                wordList.set(i,wordList.get(i+1));
                wordList.set(i+1,"A");
                i++;
            }
        }

        for (int i = 0; i < wordList.size(); i++) {
            scrambleWord += wordList.get(i);
        }

        return scrambleWord;

    }

    public static void scrambleOrRemove(List<String> wordList) {

        for (int i = 0; i < wordList.size(); i++) {
            String temp = wordList.get(i);
            if (temp.equals(scrambleWord(temp))) {
                wordList.remove(i);
                i--;
            }
            else
                wordList.set(i,scrambleWord(temp));
        }

    }

    public static void main(String[] args) {

        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("ABRACADABRA"));
        System.out.println(scrambleWord("WHOA"));
        System.out.println(scrambleWord("AARDVARK"));

        List<String> wordList = new ArrayList<String>();
        wordList.add("TAN");
        wordList.add("ABRACADABRA");
        wordList.add("WHOA");
        wordList.add("AARDVARK");

        scrambleOrRemove(wordList);

        System.out.println(wordList);

    }

}
