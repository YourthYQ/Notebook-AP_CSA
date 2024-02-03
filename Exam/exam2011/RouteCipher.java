package exam2011;

public class RouteCipher {

    private String[][] letterBlock;
    private int numRows;
    private int numCols;

    public RouteCipher(int rows, int cols) {
        numRows = rows;
        numCols = cols;
        letterBlock = new String[numRows][numCols];
    }

    private void fillBlock(String str) {
        int pos = 0;
        for (int r = 0; r < this.numRows; r++ ) {
            for (int c = 0; c < this.numCols; c++ ) {
                if (pos < str.length()) {
                    this.letterBlock[r][c] = str.substring(pos, pos+1);
                    pos++;
                } else {
                    this.letterBlock[r][c] = "A";
                }
            }
        }
    }

    private String encryptBlock() {

        String exchangeM = "";
        for (int c = 0; c < numCols; c++) {
            for (int r = 0; r < numRows; r++) {
                exchangeM += letterBlock[r][c];
            }
        }
        return exchangeM;

    }

    public String encryptMessage(String message) {

        int pos = 0;
        String enMessage = "";
        if (message.equals(""))
            return message;
        for (int i = 0; i <= (message.length() - 1) / (numRows * numCols); i++) {
            if ((pos + numRows * numCols) < message.length()) {
                fillBlock(message.substring(pos,pos + numRows * numCols));
                pos += numRows * numCols;
            }
            else
                fillBlock(message.substring(pos));

            enMessage += encryptBlock();
        }
        return enMessage;

    }

    public static void main(String[] args) {

        RouteCipher Test = new RouteCipher(2,3);
        System.out.println(Test.encryptMessage("Meet at midnight"));

        //Mte eati dmnitgAhA

    }

}
