package exam2019;

public class LightBoard {

    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {

        lights = new boolean[numRows][numCols];
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                double possibility = Math.random();
                lights[r][c] = possibility < 0.4;//possibility < 0.4 返回的值为布朗类型
            }
        }

    }

    public boolean evaluateLight(int row, int col) {

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (lights[r][c] && c % 2 == 0) {
                    lights[r][c] = false;
                }
                else if (!lights[r][c] && c % 3 == 0) {
                    lights[r][c] = true;
                }
            }
        }
        return lights[row][col];

    }

    public static void main(String[] args) {

        LightBoard sim = new LightBoard(7,5);
        System.out.println(sim.evaluateLight(0,3));
        System.out.println(sim.evaluateLight(6,0));
        System.out.println(sim.evaluateLight(4,1));
        System.out.println(sim.evaluateLight(5,4));

    }

}