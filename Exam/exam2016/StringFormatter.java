package exam2016;

import java.util.*;

public class StringFormatter {

    public static int totalLetters(List<String> wordList) {

        String words = "";
        for (int i = 0; i < wordList.size(); i++) {
            words += wordList.get(i);
        }
        return words.length();

    }

    public static int numberOfGaps(List<String> wordList, int formattedLen) {

        return wordList.size() - 1;

    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {

        return (formattedLen - totalLetters(wordList)) / numberOfGaps(wordList,formattedLen);

    }

    public static int leftoverSpaces(List<String> wordList, int formattedLen) {

        if ((formattedLen - totalLetters(wordList)) % numberOfGaps(wordList,formattedLen) == 0)
            return 0;
        else
            return formattedLen - totalLetters(wordList) - basicGapWidth(wordList,formattedLen) * numberOfGaps(wordList,formattedLen);

    }

    public static String format(List<String> wordList, int formattedLen) {

        String format = "";
        String basicGap = "";
        int remainingLeftover = leftoverSpaces(wordList,formattedLen);

        for (int i = 0; i < basicGapWidth(wordList,formattedLen); i++) {
            basicGap += " ";
        }

        if (remainingLeftover == 0) {
            for (int i = 0; i < wordList.size(); i++) {
                format += wordList.get(i);
                if (i != wordList.size() - 1)
                    format += basicGap;
            }
        }
        else {
            for (int i = 0; i < wordList.size(); i++) {
                format += wordList.get(i);
                if (i != wordList.size() - 1) {
                    format += basicGap;
                    if (remainingLeftover != 0) {
                        format += " ";
                        remainingLeftover--;
                    }
                }
            }
        }

        return format;

    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("GREEN");
        stringList.add("EGGS");
        stringList.add("AND");
        stringList.add("HAM");
        System.out.println(format(stringList,20));

    }

}