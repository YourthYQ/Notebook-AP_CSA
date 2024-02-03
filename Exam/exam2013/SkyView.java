package exam2013;

public class SkyView {

    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {

        view = new double[numRows][numCols];
        int scannedDigit = 0;

        for (int r = 0; r < numRows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < numCols; c++) {
                    view[r][c] = scanned[scannedDigit];
                    scannedDigit++;
                }
            }
            else {
                for (int c = numCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[scannedDigit];
                    scannedDigit++;
                }
            }
        }

    }

    /**
    public SkyView(int numRows, int numCols, double[] scanned) {

        view = new double[numRows][numCols];
        int scannedDigit = 0;

        for (int r = 0; r < numRows; r++) {
            if (scannedDigit == 0 || scannedDigit % numCols != 0) {
                for (int c = 0; c < numCols; c++) {
                    view[r][c] = scanned[scannedDigit];
                    scannedDigit++;
                }
            }
            else {
                for (int c = numCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[scannedDigit];
                    scannedDigit++;
                }
            }
        }

    }
     */

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {

        double sum = 0.0;
        int count = 0;
        int currentCol = startCol;

        for (int r = startRow; r < view.length; r++) {

            if (r % 2 == 0) {
                if (r < endRow) {
                    for (int c = currentCol; c < view[r].length; c++) {
                        sum += view[r][c];
                        count++;
                    }
                }
                else {
                    for (int c = currentCol; c < endCol; c++) {
                        sum += view[r][c];
                        count++;
                    }
                }
                currentCol++;
            }

            else {
                if (r < endRow) {
                    for (int c = currentCol; c >= 0; c--) {
                        sum+= view[r][c];
                        count++;
                    }
                }
                else {
                    for (int c = currentCol; c >= endCol; c--) {
                        sum+= view[r][c];
                        count++;
                    }
                }
                currentCol++;
            }

        }

        return sum / count;

    }

    public static void main(String[] args) {

        double[] scanned = new double[9];
        for (int i = 0; i < scanned.length; i++) {
            scanned[i] = i;
        }

        SkyView sv = new SkyView(3,3,scanned);

        System.out.println(sv.getAverage(0,1,1,1));//(1+2+3+4)/4 = 2.5

    }

}
