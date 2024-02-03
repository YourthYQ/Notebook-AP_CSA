package exam2018;

public class ArrayTester {

    public static int[] getColumn(int[][] arr2D, int c) {

        int[] elementsOfColumn = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            elementsOfColumn[i] = arr2D[i][c];
        }
        return elementsOfColumn;

    }

    public static boolean hasAllValues(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    return true;
            }
        }
        return false;

    }

    public static boolean containsDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return false;
            }
        }
        return true;

    }

    public static boolean isLatin(int[][] square) {

        boolean isRowEqualsRow = false;
        boolean isRowEqualsColumn = false;
        boolean isDuplicate;

        int[] arr1 = new int[square.length];
        for (int i = 0; i < square.length; i++) {
            arr1[i] = square[0][i];
        }

        int[] arr2 = new int[square.length];
        for (int i = 1; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                arr2[j] = square[i][j];
            }
            if (hasAllValues(arr1,arr2))
                isRowEqualsRow = true;
            else {
                isRowEqualsRow = false;
                break;
            }
        }

        int[] arrColumn = new int[square.length];
        for (int i = 0; i < square.length; i++) {
            arrColumn = getColumn(square,i);
            if (hasAllValues(arrColumn,arr1))
                isRowEqualsColumn = true;
            else {
                isRowEqualsColumn = false;
                break;
            }
        }

        if (containsDuplicates(arr1))
            isDuplicate = true;
        else
            isDuplicate = false;

        return isRowEqualsRow && isRowEqualsColumn && isDuplicate;

    }

}
