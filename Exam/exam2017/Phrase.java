package exam2017;

public class Phrase {

    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n) {
        int index = -1;
        int count = 1;
        for (int i = 0; i < currentPhrase.length(); i++) {
            if (currentPhrase.substring(i,i+str.length()).equals(str.substring(0))) {
                if (count == n) {
                    index = i;
                    break;
                }
                else
                    count++;
            }
        }
        return index;
    }

    public void replaceNthOccurrence(String str, int n, String repl) {
        if (findNthOccurrence(str,n) != -1) {
            currentPhrase = currentPhrase.substring(0,findNthOccurrence(str,n)) + repl.substring(0) + currentPhrase.substring(findNthOccurrence(str,n)+str.length());
        }
    }

    public int findLastOccurrence(String str) {
        int index = 1;

        while(findNthOccurrence(str,index) != -1) {
            index++;
        }

        return findNthOccurrence(str,index);
    }

    public String toString() {
        return currentPhrase;
    }

}