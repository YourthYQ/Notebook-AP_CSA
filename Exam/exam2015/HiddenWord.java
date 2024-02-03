package exam2015;

public class HiddenWord {

    private String hiddenWord;

    public HiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public String getHint(String guess) {

        String hint = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.substring(i,i+1).equals(hiddenWord.substring(i,i+1)))
                hint += guess.substring(i,i+1);
            if (hiddenWord.indexOf(guess.substring(i,i+1)) == i)
                hint += "+";
            if (hiddenWord.indexOf(guess.substring(i,i+1)) == -1)
                hint += "*";
        }
        return hint;

    }

}
