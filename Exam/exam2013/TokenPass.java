package exam2013;

public class TokenPass {

    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount) {

        board = new int[playerCount];
        for (int i = 0; i < board.length; i++) {
            board[i] = 1 + (int)(Math.random()*10);
        }

        currentPlayer = (int)Math.random()*(playerCount);

    }

    public void distributeCurrentPlayerTokens() {

        int nextPlayer = currentPlayer + 1;
        while (board[currentPlayer] > 1) {
            if (nextPlayer < board.length) {
                board[nextPlayer]++;
                nextPlayer++;
                board[currentPlayer]--;
            }
            else {
                nextPlayer = 0;
                board[nextPlayer]++;
                nextPlayer++;
                board[currentPlayer]--;
            }
        }

    }

}
