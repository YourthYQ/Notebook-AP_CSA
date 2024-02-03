package exam2019;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {

        ArrayList<String> d = new ArrayList<String>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(openDel) || tokens[i].equals(closeDel))
                d.add(tokens[i]);
        }
        return d;

    }

    public boolean isBalanced(ArrayList<String> delimiters) {

        delimiters = new ArrayList<String>();
        int numOpen = 0;
        int numClose = 0;
        for (int i = 0; i < delimiters.size(); i++) {
            if (delimiters.get(i).equals(openDel))
                numOpen++;
            else
                numClose++;
            if (numOpen > numClose)
                return false;
        }
        if (numOpen == numClose) {
            return true;
        }
        else
            return false;

    }

}
