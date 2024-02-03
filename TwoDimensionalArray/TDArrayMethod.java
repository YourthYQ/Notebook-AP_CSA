package Note.TwoDimensionalArray;

public class TDArrayMethod {

    public static void main(String[] args) {

        //2DArray-Traversal(array processing)
        //row-column
        int sum = 0;
        int[][] arr2D = new int[3][4];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                sum += arr2D[i][j];
                System.out.println(sum);
            }
        }

        //for-each loop
        sum = 0;
        for (int[] row : arr2D) { //row = arr2D[i][]
            for (int element : row) { //element = row[i]
                sum += element;
                System.out.println(sum);
            }
        }

        //row-by-row
        sum = 0;
        for (int row = 0; row < arr2D.length; row++) {
            sum += sumArray(arr2D[row]);
            System.out.println(sum);
        }

    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int element : arr)
            sum += element;
        return sum;
    }

}
