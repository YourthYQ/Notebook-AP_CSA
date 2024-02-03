package exam2016;

public class CrossWord {

    private Square[][] puzzle;

    public CrossWord(boolean[][] blackSquares) {

        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int labelNum = 1;

        for (int r = 0; r < puzzle.length; r++) {
            for (int c = 0; c < puzzle[r].length; c++) {
                if (blackSquares[r][c])
                    puzzle[r][c] = new Square(true,0);
                else if (toBeLabeled(r,c,blackSquares)) {
                    puzzle[r][c] = new Square(false,labelNum);
                    labelNum++;
                }
                else
                    puzzle[r][c] = new Square(false,0);
            }
        }

    }

    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {

        if (!blackSquares[r][c]) {
            if (r == 0 || ((r-1) >= 0 && blackSquares[r-1][c]))
                return true;
            if (c == 0 || ((c-1) >= 0 && blackSquares[r][c-1]))
                return true;
            if (((c-1) >= 0 && (c+1) < blackSquares[r].length) && (blackSquares[r][c-1] && blackSquares[r][c+1]))
                return true;
        }
        return false;

    }

}
