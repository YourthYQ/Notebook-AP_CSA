package exam2018;

import java.util.ArrayList;

public class WordPairLIst {

    private ArrayList<WordPair> allPairs;

    public WordPairLIst(String[] words) {

        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }

    }

    public int numMataches() {

        int count = 0;
        for (int i = 0; i < allPairs.size(); i++) {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond()))
                count++;
        }
        return count;

    }

}
