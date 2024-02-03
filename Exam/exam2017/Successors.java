package exam2017;

public class Successors {

    public static Position findPosition(int num, int[][]intArr) {

        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < intArr[r].length; c++) {
                if (intArr[r][c] == num) {
                    return new Position(r,c);
                }
            }
        }
        return null;

    }

    public static Position[][] getSuccessorArray(int[][] intArr) {

        Position[][] successorArray = new Position[intArr.length][intArr[0].length];

        for (int r = 0; r < successorArray.length; r++) {
            for (int c = 0; c < successorArray[r].length; c++) {
                if (findPosition(intArr[r][c] + 1,intArr) != null)
                    successorArray[r][c] = findPosition(intArr[r][c] + 1,intArr);
                else
                    successorArray[r][c] = null;
            }
        }
        return successorArray;

    }

}
