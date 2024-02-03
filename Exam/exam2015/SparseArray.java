package exam2015;

import java.util.*;

public class SparseArray {

    private int numRows;

    private int numCols;

    private List<SparseArrayEntry> entries;

    public SparseArray() {
        entries = new ArrayList<SparseArrayEntry>();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getValueAt(int row, int col) {

        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getRow() == row && entries.get(i).getCol() == col)
                return entries.get(i).getValue();
        }
        return 0;

    }

    public void removeColumn(int col) {

    }

}
